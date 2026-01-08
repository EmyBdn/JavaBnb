package emeline.javabnb;

import emeline.javabnb.logements.Logement;
import emeline.javabnb.logements.Maison;
import emeline.javabnb.reservations.Sejour;
import emeline.javabnb.utilisateurs.Hote;
import emeline.javabnb.utilisateurs.Personne;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hote moi = new Hote("Emeline", "Baudouin", 27, 1);

        Logement leDomainedOreo = new Logement(moi, 15, "8 rue Jeanne Jugan, 45000 Orléans", 38, 2);
        leDomainedOreo.afficher();

        Date dateArriveeSejour1 = new Date(124, 11,15);
        Sejour vacancesEnneigees = new Sejour(dateArriveeSejour1, 4, leDomainedOreo, 2);
        vacancesEnneigees.afficher();

        Maison monHameauDeCharme = new Maison(moi, 120, "29 Avenue des Oliviers, 83000 Toulon", 200, 6, 0, true);
        monHameauDeCharme.afficher();
    }
}
