import java.util.*;

public class Hello_User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();    
        System.out.println("Hello, " +name  + "! Enter your Lucky Number: ");
        int lnum = sc.nextInt();
        System.out.println("Hello, " + name + "! As per ur Lucky number. " + lnum + "\tYou are hard working !!");

    

        
    }
}