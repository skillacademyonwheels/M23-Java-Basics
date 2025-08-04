public class calci {
    
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;
        System.out.println("-------Calculations:-----");
        System.out.printf("First Number (a): %d  and Second Number (b): %d \n" ,a,b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference:" + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
