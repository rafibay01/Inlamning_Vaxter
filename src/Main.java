import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        //Skapar objekt för varje växt.
        Plants igge = new Kaktusar("Igge", 20);
        Plants Laura = new Palmer("Laura", 5);
        Plants Meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Plants Olof = new Palmer("Olof", 1);

        //Lagrar dessa i en array
        Plants[] plants = {igge, Laura, Meatloaf, Olof};

        //En while loop som körs tills användaren avslutar programmet.
        while (true) {
            String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska? Avbryt för att avsluta");

            if (plantName == null) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas.");
                break;
            }

            //Detta block körs när användaren matar in växtnamn.
            if (plantName != null && !plantName.isEmpty()) {
                boolean found = false;

                //Loopar igenom växtarray.
                for (Plants plant : plants) {
                    if (plant.name.equalsIgnoreCase(plantName)) {
                        try {
                            IWater plantWater = (IWater) plant; //Här används polymorfism. Skapar ett IWater objekt "plantWater".
                            String message = plant.name + " ska ha " + plantWater.calculateWater() + " liter " + plantWater.waterType().toString().toLowerCase() + " per dag. ";
                            JOptionPane.showMessageDialog(null, message);
                            found = true;
                            break;
                        } catch (IllegalArgumentException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }

                    }
                }
                //Om annat anges vid input exekveras detta block.
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Ingen växt med namnet " + plantName + " hittades.");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Du måste ange ett växtnamn.");
            }
        }
    }
}