public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = new Parent();
        child.sayHello(); // Calls Child's method
        child.sayGoodbye();
        parent.sayHello(); // Calls Parent's method
        
    }
    
}   



class Parent{

    public void sayHello() {
        System.out.println("Hello from Parent");
    }           
}

class Child extends Parent {

    @Override
    public void sayHello() {
        System.out.println("Hello from Child");
    }
    
    public void sayGoodbye() {
        System.out.println("Goodbye from Child");
    }
}       