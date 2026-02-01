 class Student1{
    String name;
    int age;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //constructor
     //here it tells what process or what to do with this data(telling ave name and age)
     Student1(String name, int age){
        this.name=name;
        this.age=age;
     }
 }

public class Students {
    public static void main(String[] args) {

        Student1 s1= new Student1("Ammar", 20);// here constructor will save name and age. it runs here and the process is in the class
        s1.info();

        Student1 s2= new Student1("dyy", 8);
        s2.info();
    }
}
