public class Main {
    public static void main(String[] args) {
        System.out.println("====== Method Overloading Example ======");

         Student student1 = new Student();
         Student student2 = new Student(101, "Alice");
            Student student3 = new Student(102, "Bob", 1500.50f);

            student1.display();
            student2.display(); 
            student3.display();

    }
}


class Student{
    int id;
    String name;
    float stipend;

    Student(){}

 Student(int id, String name){
        this.id = id;
        this.name = name;
    }


    Student(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    void display(){
        System.out.println("ID: " + id + ", Name: " + name + ", Stipend: " + stipend);
    }   

}
