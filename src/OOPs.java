

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something...");
    }

    public void showColor() {
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class OOPs {
    public static void main(String[] args){

//        Pen pen1= new Pen();
//        Pen pen2= new Pen();
//
//        pen1.color="blue";
//        pen2.color="black";
//        pen1.type="ball";
//        pen2.type="gel";
//
//        pen1.showColor();
//        pen2.showColor();
//        pen1.write();

        //Student
        Student s1= new Student();

        s1.name="Ammar";
        s1.age=20;

        s1.studentInfo();

        Student s2=new Student();
        s2.name="Hammad";
        s2.age=55;
        s2.studentInfo();
    }
}