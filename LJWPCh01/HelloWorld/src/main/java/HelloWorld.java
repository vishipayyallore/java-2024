
public class HelloWorld {

    public static void main(String[] args) {

        String greeting = "Hello Java 21 world!";
        System.out.println(greeting);

        int value = 5;
        System.out.println("The doubled number is: " + doubleNumber(value));

        greeting = "Welcome to Mesozoic Eden";
        displayMessage(greeting);

        String name = "Maaike";
        String position = "Park Manager";
        greeting = String.format("My name is %s and I want to be a %s in Mesozoic Eden.", name, position);
        displayMessage(greeting);
    }

    private static int doubleNumber(int input) {
        return input * 2;
    }

    private static void displayMessage(String message){
        System.out.println(message);
    }
}
