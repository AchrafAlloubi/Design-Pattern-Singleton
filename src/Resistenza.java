public class Resistenza {

    private final EspritDeLaResistance espritDeLaResistance;

    public Resistenza(String name) {

        this.espritDeLaResistance = new EspritDeLaResistance(name);
    }

    public EspritDeLaResistance communiquerAvecEspritDeLaResistance() {
        return espritDeLaResistance;
    }
}
