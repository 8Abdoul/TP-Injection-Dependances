package presentation;

import dao.IDao;
import metier.IMetier;

import java.lang.reflect.Method;

public class Pres_Dynamique {
    public static void main(String[] args) throws Exception {
        Class<?> cDao = Class.forName("dao.DaoImpl");
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

        Class<?> cMetier = Class.forName("metier.MetierImpl");
        IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();

        Method m = cMetier.getMethod("setDao", dao.getClass().getInterfaces()[0]);
        m.invoke(metier, dao);

        System.out.println("Résultat dynamique : " + metier.calcul());
    }
}
