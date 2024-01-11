public class VariablesDemo {

    public static void main(String[] args){
        showVariablesDemo();

        showDinosaurDetailsV1();

        showDinosaurDetailsV2();

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

    private static void showDinosaurDetailsV1(){
        String breed = "T-Rex";
        double height = 12.3; //in meters
        double length = 20.2; //in meters
        double weight = 8000; //in kilograms

        //Print the variables
        System.out.println("\n***** Dinosaur Details V1 *****");
        System.out.printf("Breed: %s%n", breed);
        System.out.printf("Height: %f meters%n", height);
        System.out.printf("Length: %f meters%n", length);
        System.out.printf("Weight: %f Kilograms%n", weight);
        System.out.println("---------------------------------\n");
    }

    private static void showDinosaurDetailsV2(){
        int age = 7; //in years
        String name = "Rexy";
        boolean isCarnivore = true;
        int maxVisitors = 10000; //per day

        //Print the variables
        System.out.println("\n***** Dinosaur Details V2 *****");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d meters%n", age);
        System.out.printf("isCarnivore: %s%n", isCarnivore);
        System.out.printf("There's a maximum of %s people allowed in Mesozoic Eden.%n", maxVisitors);
        System.out.println("---------------------------------\n");
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
