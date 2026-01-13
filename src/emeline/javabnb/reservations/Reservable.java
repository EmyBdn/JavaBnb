package emeline.javabnb.reservations;

public interface Reservable {

    //Une interface ne définit que des méthodes publiques par défaut
    boolean aUneDateArriveeCorrecte();
    boolean aUnNombreDeNuitsCorrect();
    boolean aUnNombreDeVoyageursCorrect();
    void afficher();
}
