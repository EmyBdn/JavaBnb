package emeline.javabnb;

import emeline.javabnb.logements.Logement;
import emeline.javabnb.utilisateurs.Personne;

public class Main {
    public static void main(String[] args) {
        Personne moi = new Personne("Emeline", "Baudouin", 27);
        moi.afficher();

        Logement leDomainedOreo = new Logement(moi, 15, "8 rue Jeanne Jugan, 45000 Orléans", 38, 2);
        leDomainedOreo.afficher();
    }
}
