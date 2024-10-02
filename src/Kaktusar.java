//Denna klass ärver från superklassen "Plants"

public class Kaktusar extends Plants implements IWater {
    public Kaktusar(String name, double length) {
        super(name, length);
    }


    @Override
    public WaterType waterType() {
        return WaterType.MINERALVATTEN;

    }

    @Override
    public double calculateWater() {
        return 0.02;
    }
}
