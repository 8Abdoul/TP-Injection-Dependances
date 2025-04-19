package app;

import app.metier.EtudiantMetier;
import app.service.PlanningService;
import framework.xml.XmlAppContext;

public class MainApp {
    public static void main(String[] args) {
        XmlAppContext context = new XmlAppContext("Part2-Mini_Projet/config/beans.xml");

        EtudiantMetier metier = (EtudiantMetier) context.getBean("etudiantMetier");
        System.out.println(metier.afficherNomEtudiant(1));

        PlanningService planning = (PlanningService) context.getBean("planningService");
        System.out.println(planning.afficherFormateur(2));
    }
}
