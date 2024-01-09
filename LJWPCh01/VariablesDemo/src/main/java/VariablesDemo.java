public class VariablesDemo {

    public static void main(String[] args){
        showVariablesDemo();

        showDinosaurDetails();

        showDinosaurProfile();
    }

    private static void showVariablesDemo(){
        String name = "James";
        int age = 23;
        double salary = 50_000.0;

        String output = String.format( "Person Details: \nName: %s \nAge: %d \nSalary: %f", name, age,salary);
        System.out.println(output);
    }

    private static void showDinosaurDetails(){
        String breed = "T-Rex";
        double height = 12.3; //in meters
        double length = 20.2; //in meters
        double weight = 8000; //in kilograms

        //Print the variables
        System.out.println("\n***** Dinosaur Details *****");
        System.out.println(String.format("Breed: %s", breed));
        System.out.println(String.format("Height: %f meters", height));
        System.out.println(String.format("Length: %f meters", length));
        System.out.println(String.format("Weight: %f Kilograms", weight));
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
    }
}
