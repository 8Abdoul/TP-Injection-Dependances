package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres_Static {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultat statique : " + metier.calcul());
    }
}
