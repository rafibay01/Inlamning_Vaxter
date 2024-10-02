//Denna klass ärver från superklassen "Plants"


public class Palmer extends Plants implements IWater {
    public Palmer(String name, double length) {
        super(name, length);
    }

    @Override
    public WaterType waterType() {
        return WaterType.KRANVATTEN;


    }

    @Override
    public double calculateWater() {
        return 0.5 * length;
    }
}
