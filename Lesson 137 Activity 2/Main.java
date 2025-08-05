public class Main {
    public static void main(String[] args) {
        System.out.println("=====Multi Level Inheritance=====");
        Puppy puppy = new Puppy();
        puppy.eat();  // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Specific to Puppy


    }
}


class Animal {
    void eat() {
        System.out.println("Animal is eating :slurp slurp");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking: wow wow");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping: mew mew");
    }
}

