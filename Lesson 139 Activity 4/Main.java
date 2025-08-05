public class Main {
    public static void main(String[] args) {
        System.out.println("======== Access Modifiers in Java ======== ");

        Child child = new Child();
        child.display();
        //Child.show(); // This line would cause a compile-time error since show() is private in Parent

    }
}

class Parent {
    protected void display() {
        System.out.println("Parent class display method");
    }
    private void show() {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent {
    @Override
    protected void display() {
        System.out.println("Child class display method");
      //  System.out.println("Accessing Parent class show method"+ super.show());
    }
    
}