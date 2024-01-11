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
        System.out.println(String.format("Breed: %s", breed));
        System.out.println(String.format("Height: %f meters", height));
        System.out.println(String.format("Length: %f meters", length));
        System.out.println(String.format("Weight: %f Kilograms", weight));
        System.out.println("---------------------------------\n");
    }

    private static void showDinosaurDetailsV2(){
        int age = 7; //in years
        String name = "Rexy";
        boolean isCarnivore = true;

        //Print the variables
        System.out.println("\n***** Dinosaur Details V2 *****");
        System.out.println(String.format("Name: %s", name));
        System.out.println(String.format("Age: %d meters", age));
        System.out.println(String.format("isCarnivore: %s", isCarnivore));
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
        System.out.println(String.format("Name: %s", dinoName));
        System.out.println(String.format("Age: %d years", dinoAge));
        System.out.println(String.format("Species: %s", species));
        System.out.println(String.format("Diet: %s", diet));
        System.out.println(String.format("Weight: %f Kilograms", weight));
        System.out.println("---------------------------------\n");
    }
}
