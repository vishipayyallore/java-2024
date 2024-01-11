public class VariablesDemo {

    public static void main(String[] args){
        showVariablesDemo();

        showDinosaurDetails();

        showMesozoicEdenDetails();

        showDinosaurProfile();
    }

    private static void showVariablesDemo(){
        String name = "James";
        int age = 23;
        double salary = 50_000.0;

        System.out.println("\n***** Show Variables Demo *****");
        String output = String.format( "Person Details: \nName: %s \nAge: %d \nSalary: %f", name, age,salary);
        System.out.println(output);
        System.out.println("---------------------------------\n");
    }

    private static void showDinosaurDetails(){
        String name = "Rexy";
        int age = 7; //in years
        String breed = "T-Rex";
        double height = 12.3; //in meters
        double length = 20.2; //in meters
        double weight = 8000; //in kilograms
        boolean isCarnivore = true;
        char speciesFirstLetter = 'T'; //First letter of T-Rex

        //Print the variables
        System.out.println("\n***** Dinosaur Details *****");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d meters%n", age);
        System.out.printf("Breed: %s%n", breed);
        System.out.printf("Height: %f meters%n", height);
        System.out.printf("Length: %f meters%n", length);
        System.out.printf("Weight: %f Kilograms%n", weight);
        System.out.printf("isCarnivore: %s%n", isCarnivore);
        System.out.printf("First letter of Finosaur species: %c%n", speciesFirstLetter);
        System.out.println("---------------------------------\n");
    }

    private static void showMesozoicEdenDetails(){
        int maxVisitors = 10000; //per day
        int numberOfDinosaurs = 50;
        int safetyRating = 9; //on a scale of 1 to 10

        //Print the variables
        System.out.println("\n***** Mesozoic Eden Park Details *****");
        System.out.printf("There's a maximum of %s people allowed in Mesozoic Eden.%n", maxVisitors);
        System.out.printf("Number of Dinosaurs in the Mesozoic Eden Park is %d%n", numberOfDinosaurs);
        System.out.printf("Mesozoic Eden Park's Rating is %d/10", safetyRating);
        System.out.println("\n---------------------------------\n");
    }

    private static void showDinosaurProfile(){
        //Declare variables
        String dinoName = "Rexy";
        int dinoAge = 7; //in years
        String species = "T-Rex";
        String diet = "Carnivore";
        double weight = 8000; //in kilograms

        //Print the variables
        System.out.println("\n***** Dinosaur Profile *****");
        System.out.printf("Name: %s%n", dinoName);
        System.out.printf("Age: %d years%n", dinoAge);
        System.out.printf("Species: %s%n", species);
        System.out.printf("Diet: %s%n", diet);
        System.out.printf("Weight: %f Kilograms%n", weight);
        System.out.println("---------------------------------\n");
    }
}
