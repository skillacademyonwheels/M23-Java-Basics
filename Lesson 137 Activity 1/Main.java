public class Main {
    public static void main(String[] args) {
        System.out.println("====== Interface Example ======");

        Child child = new Child(10, 1, "XYZ");
        child.set_name("ABC");   
        child.set_age(3);
    }
}

class Parent {

    int age, id;
    String name;

    Parent(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }
    Parent() {
        System.out.println("Parent class default constructor");
    }

    void set_name(String name) {
        System.out.println("Name of the parent/child is: " + name);
    }
}

class Child extends Parent {

    Child(int age, int id, String name) {
        super(age, id, name);
        System.out.println("Child class constructor");

    }

    void set_age(int age) {
        System.out.println("Age of the parent/child is: " + age);
    }


}
