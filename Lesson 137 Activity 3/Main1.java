public class Main1 {
    public static void main(String[] args) {
        System.out.println("====== Multiple Inheritance Example ======");
        Lion lion = new Lion();
        lion.mam();
        lion.roar();
        // lion.speak() // This line would cause a compile-time error since Lion does
        // not have a speak method
        
    }

}

class Mammals {
    public void mam() {
        System.out.println("Inside Mammal Class.");
    }
}

class Lion extends Mammals {
    public void roar() {
        System.out.println("Inside Lion Class.");
    }
}

class Human extends Mammals {
    public void speak() {
        System.out.println("Inside Human Class.");
    }
}