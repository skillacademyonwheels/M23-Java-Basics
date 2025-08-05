
public class Main {
 
    int age;
    Main(int age) {
        age = age;
    }

    public static void main(String[] args) {
        System.out.println("===== This Keyword is used to refer to the current object =====");

        Main obj = new Main(27);
        System.out.println("Age: " + obj.age);
    }
}