package framework.xml;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XmlAppContext {
    private Map<String, Object> beans = new HashMap<>();

    public XmlAppContext(String path) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File(path));

            // Étape 1 : instancier les beans
            NodeList beanNodes = doc.getElementsByTagName("bean");
            for (int i = 0; i < beanNodes.getLength(); i++) {
                Element bean = (Element) beanNodes.item(i);
                String id = bean.getAttribute("id");
                String className = bean.getAttribute("class");

                Class<?> cls = Class.forName(className);
                Object obj = cls.getDeclaredConstructor().newInstance();
                beans.put(id, obj);
            }

            // Étape 2 : injection des dépendances (setter)
            for (int i = 0; i < beanNodes.getLength(); i++) {
                Element bean = (Element) beanNodes.item(i);
                String id = bean.getAttribute("id");
                Object beanObj = beans.get(id);

                NodeList properties = bean.getElementsByTagName("property");
                for (int j = 0; j < properties.getLength(); j++) {
                    Element prop = (Element) properties.item(j);
                    String name = prop.getAttribute("name");
                    String ref = prop.getAttribute("ref");

                    Object refBean = beans.get(ref);

                    String setter = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
                    Method m = beanObj.getClass().getMethod(setter, refBean.getClass().getInterfaces()[0]);
                    m.invoke(beanObj, refBean);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String id) {
        return beans.get(id);
    }
}
