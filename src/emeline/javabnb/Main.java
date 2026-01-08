package emeline.javabnb;

import emeline.javabnb.logements.Logement;
import emeline.javabnb.reservations.Sejour;
import emeline.javabnb.utilisateurs.Personne;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Personne moi = new Personne("Emeline", "Baudouin", 27);

        Logement leDomainedOreo = new Logement(moi, 15, "8 rue Jeanne Jugan, 45000 Orléans", 38, 2);
        leDomainedOreo.afficher();

        Date dateArriveeSejour1 = new Date(124, 11,15);
        Sejour vacancesEnneigees = new Sejour(dateArriveeSejour1, 4, leDomainedOreo, 2);
        vacancesEnneigees.afficher();
    }
}
