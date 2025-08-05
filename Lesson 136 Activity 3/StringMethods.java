import java.util.Scanner;


public class StringMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("==== String Methods ====");

        System.out.print("Enter a First string: ");
        String first = scanner.nextLine();
        System.out.print("Enter a Second string: ");
        String second = scanner.nextLine();

        String concaString = first +" "+ second;
        System.out.println("Concatenated String: " + concaString);  
        String capString = concaString.toUpperCase();
        System.out.println("Uppercase String: " + capString);
        String lowString = concaString.toLowerCase();  
        System.out.println("Lowercase String: " + lowString); 

        int lenString = concaString.length();
        System.out.println("Length of Concatenated String: " + lenString);

    }
}