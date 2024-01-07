
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

        String openingHours = "08:00";
        String closingHours = "20:00";
        greeting = String.format("We open at %s and close at %s.", openingHours, closingHours);
        displayMessage(greeting);

        String yourName = "Maaike";
        greeting = String.format("Welcome %s, to Mesozoic Eden!", yourName);
        displayMessage(greeting);
        greeting = "Mesozoic Eden is safe and secure.";
        displayMessage(greeting);

        showEntrance();
    }

    private static int doubleNumber(int input) {
        return input * 2;
    }

    private static void displayMessage(String message){
        System.out.println(message);
    }

    private static void showEntrance(){
        String greeting = "***** Welcome to Mesozoic Eden *****";
        displayMessage(greeting);

        String openingHours = "08:00";
        String closingHours = "20:00";
        greeting = String.format("We open at %s and close at %s.", openingHours, closingHours);
        displayMessage(greeting);

        greeting = "Mesozoic Eden is safe and secure.";
        displayMessage(greeting);

    }
}
