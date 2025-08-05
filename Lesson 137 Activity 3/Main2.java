public class Main2 {
    public static void main(String[] args) {
        // This is the main method where the program starts
        System.out.println("====== Multiple Inheritance Example ======");

        Car myCar = new Car();
        myCar.start();
        myCar.charge();
        myCar.batteryStatus();
        myCar.stop();
        System.out.println("Program finished.");
    }
}

 interface Vehicle {
    void start();
    void stop();
    
}

 interface ElectricVehicle{
    void charge();
    void batteryStatus();
}

class Car implements Vehicle, ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public void charge() {
        System.out.println("Car is charging.");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Battery status: Full");
    }

    
}