//Denna klass ärver från superklassen "Plants"

public class KöttätandeVäxt extends Plants implements IWater {
    public KöttätandeVäxt(String name, double length) {
        super(name, length);
    }

    @Override
    public WaterType waterType() {
        return WaterType.PROTEINDRYCK;

    }

    @Override
    public double calculateWater() {
        return 0.1 + (0.2 * length);
    }
}
