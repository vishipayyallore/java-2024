public class VariablesDemo {

    public static void main(String[] args){
        showVariablesDemo();

        showDinosaurDetails();
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
        System.out.println("\nDinosaur Details");
        System.out.println(String.format("Breed: %s", breed));
        System.out.println(String.format("Height: %f meters", height));
        System.out.println("Length: " + length + "m");
        System.out.println("Weight: " + weight + "kg");
    }

}
