public class Mind_Riddler {
    public static void main(String[] args) {
        // Example usage of the Mind_Riddler class
        System.out.println("Welcome to the Mind Riddler!");

        int a = 10;
        int b = 20;
        System.out.println("======Guess the Answer======");
        System.out.println("Uniary operator : " + (a++));
        System.out.println("uniary operator : " + (++b));
        System.out.println("Binary operator : " + (a + b));
        System.out.println("Binary operator 1+2 : " + 1+2);
        System.out.println("Binary operator 1+2 : " + (1 + 2));
        System.out.println(1+2 + " =3");
        System.out.println("Ternary operator : " + (a > b ? a : b));
        System.out.println("Largest number is : " + (a > b ? a : b));
        System.out.println("Smallest number is : " + (a > b ? b : a));
    }

    // Add methods and properties as needed for the Mind Riddler functionality
}