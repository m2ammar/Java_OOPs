class Person{
    String name;
    int age;

    //polymorphism
    public void information(String name){
        System.out.println(name);
    }

    public void information(int age){
        System.out.println(age);
    }

    public void information(String name, int age){
        System.out.println(name+" "+age);
    }
}
public class OOP5 {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.name="Ammar";
        p1.age = 20;
        p1.information(p1.age);//these parameter will decide wht method has to be used
        //example if just age passed, it will use second method, if both then 3, if name then 1.
    }
}
