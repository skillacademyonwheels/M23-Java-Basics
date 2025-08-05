class Counter {
     static int count;;

    public Counter() {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setreset() {
        count = 0;
    }

}

public class StaticCounter {
   public static void main(String[] args) {
     
         Counter counter1 = new Counter();
         Counter counter2 = new Counter();
    
         counter1.increment();
         counter1.increment();
         System.out.println("Counter 1: " + counter1.getCount()); // Output: 2
    
         counter2.increment();
         System.out.println("Counter 2: " + counter2.getCount()); // Output: 1
    
         counter1.setreset();
         System.out.println("Counter 1 after reset: " + counter1.getCount()); // Output: 0

   }
}