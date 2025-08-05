public class Main {
    public static void main(String[] args) {
        System.out.println("====Super Keyword ======");

        Subclass subclass = new Subclass();
        subclass.display();
    }
}

class SuperClass {
    int number = 10;
}

class Subclass extends SuperClass {
    int number = 20;

    void display() {
        System.out.println("Number in Subclass: " + number);
        System.out.println("Number in SuperClass: " + super.number);
    }
}