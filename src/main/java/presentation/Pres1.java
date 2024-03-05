package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {

    public static void main(String[] args) {
        //ON VA TRAVAILLER ICI AVEC LE COUPLAGE FORT CAD LIAISON DIRECTE D'UNE CLASSE AVEC UNE AUTRE
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao);
        //injection via constructeur
       // metier.setDao(dao);
        System.out.println(metier.calcul());


    }
}
