import oracle.Oracle;

public class EspritDeLaResistance {
    private final String croyant;

    EspritDeLaResistance(String croyant) {
        this.croyant = croyant;
    }

    public void ecouterEtRepondre(String request) {
    	Oracle.getInstance().getEcouteInterface().ecouterEtRepondre(request, "EspritDeLaResistance", croyant);
    }

    public void ecouterEtRealiserMiracle(String request) {
    	Oracle.getInstance().getEcouteInterface().ecouterEtRealiserMiracle(request, "EspritDeLaResistance", croyant);
    }

    public void ecouterEtPunir(String request) {
    	Oracle.getInstance().getEcouteInterface().ecouterEtPunir(request, "EspritDeLaResistance", croyant);
    }

    public void realiserMiracle(String request) {
        System.out.println(croyant + " a une demande : " + request);
        Oracle.getInstance().getMiracleInterface().realiserMiracle("EspritDeLaResistance", croyant);
    }

    public void PunitionSansRaison() {
    	Oracle.getInstance().getRecompenseInterface().PunitionSansRaison("EspritDeLaResistance", croyant);
    }

    public void echangerMiracleEtPunition() {
    	Oracle.getInstance().getRecompenseInterface().echangerMiracleEtPunition("EspritDeLaResistance", croyant);
    }
}
