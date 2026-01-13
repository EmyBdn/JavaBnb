package emeline.javabnb.logements;

import emeline.javabnb.utilisateurs.Hote;

public class Appartement extends Logement {

    private final int superficieBalcon;
    private final int numeroEtage;

    public Appartement(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax, int paramSuperficieBalcon, int paramNumeroEtage) {
        super(paramHote, paramTarifParNuit, paramAdresse, paramSuperficie, paramNbVoyageursMax);
        this.superficieBalcon = paramSuperficieBalcon;
        this.numeroEtage = paramNumeroEtage;
    }

    @Override
    public void afficher() {
        System.out.print(
                numeroEtage == 0
                    ? " au rez de chaussée."
                    : numeroEtage == 1
                        ? " au 1er étage"
                        : " au " + numeroEtage + "ème étage"
        );

        System.out.println("Superficie : " + getSuperficie() + "m2");

    }
}
