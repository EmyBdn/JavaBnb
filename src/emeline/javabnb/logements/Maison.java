package emeline.javabnb.logements;

import emeline.javabnb.utilisateurs.Hote;

public class Maison extends Logement {

    private final int superficieJardin;
    private final Boolean possedePiscine;

    public Maison(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax, int paramSuperficieJardin, Boolean paramPossedePiscine) {
        super(paramHote, paramTarifParNuit, paramAdresse, paramSuperficie, paramNbVoyageursMax);
        this.superficieJardin = paramSuperficieJardin;
        this.possedePiscine = paramPossedePiscine;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(
                superficieJardin == 0
                        ? "Jardin : Non"
                        : "Jardin : Oui (" + superficieJardin + "m²)"
        );
        System.out.println(
                possedePiscine ? "Piscine : Oui" : "Piscine : Non"
        );
    }

}
