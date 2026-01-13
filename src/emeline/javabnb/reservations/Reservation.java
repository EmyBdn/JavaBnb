package emeline.javabnb.reservations;

import emeline.javabnb.outils.Utile;
import emeline.javabnb.utilisateurs.Voyageur;
import java.util.Date;

public class Reservation {
    private final Reservable objetReservable;
    private final Voyageur voyageur;
    private final Date dateReservation;

    public Reservation(Reservable paramObjetReservable, Voyageur paramVoyageur) throws Exception {

        if (!paramObjetReservable.aUneDateArriveeCorrecte()) {
            throw new Exception("La date d'arrivée n'est pas correcte.");
        }
        if (!paramObjetReservable.aUnNombreDeNuitsCorrect()) {
            throw new Exception("Le nombre de nuits doit être compris entre 1 et 31.");
        }
        if (!paramObjetReservable.aUnNombreDeVoyageursCorrect()) {
            throw new Exception("Le nombre de voyageurs n'est pas correct.");
        }

        objetReservable = paramObjetReservable;
        voyageur = paramVoyageur;
        dateReservation = new Date();


    }

    public void afficher() {
        System.out.println(("Date de la réservation : " + Utile.formatDate(dateReservation)));
        System.out.println("Voyageur : " + voyageur);
        System.out.println("A réservé chez ");

        objetReservable.afficher();
    }
}
