//Interfacet talar om för alla växtklasser att de behöver dessa metoder som ska visa deras vattentyp samt kalkylera mängden vatten.

public interface IWater {

    WaterType waterType();

    double calculateWater();
}
