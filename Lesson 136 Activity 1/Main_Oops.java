class Employee{
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main_Oops {
    public static void main(String[] args) {
        System.out.println("====== Employee Information ===");
        Employee emp1 = new Employee("Alice", 30);
        Employee emp2 = new Employee("Bob", 25);
        Employee emp3 = new Employee("Charlie", 28);
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        System.out.println("====== End of Employee Information ===");
    }
}
