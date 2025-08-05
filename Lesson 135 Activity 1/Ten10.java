public class Ten10 {
    public static void main(String[] args) {
        System.out.println("======= Print Numbers from 1 to 10 =======");
        // Using for Loop to print numbers from 1 to 10
        System.out.println("======= Using For Loop =======");
        for(int i = 1; i <= 10; i++) {
            System.out.println("The value of i is: " + i);
        }

        System.out.println("======= Using While Loop =======");
        // Using while Loop to print numbers from 1 to 10
        int j = 1;
        while(j <= 10) {
            System.out.println("The value of j is: " + j);
            j++;
        }
    }
}
