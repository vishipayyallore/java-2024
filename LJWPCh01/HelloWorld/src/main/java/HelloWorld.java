
public class HelloWorld {

    public static void main(String[] args) {

        String greeting = "Hello Java 21 world!";
        System.out.println(greeting);

        System.out.println("The doubled number is: " + doubleNumber(5));
    }

    public static int doubleNumber(int input) {
        return input * 2;
    }
}
