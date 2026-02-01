class Employee{
    String id;
    String name;
    int age;
    double salary;

    public void employeeInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
        System.out.println(this.salary);
    }

    //constructor for no parameter
    Employee(){
        name="Ahmed";
        age=30;
        id="2005";
        salary=998.0;
    }

    //parameterized constructor
    Employee(String name,String id, int age, double salary){
        this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;
    }

    //constructor for copy
    Employee(Employee e1){
        name=e1.name;
        id=e1.id;
        age=e1.age;
        salary=e1.salary;
    }

}

public class OOP3 {
    public static void main(String[] args) {

        Employee e1= new Employee();
        Employee e2=new Employee("Ammar", "1002", 20, 3000.8);
        Employee e3= new Employee(e1);

        e1.employeeInfo();
        e2.employeeInfo();
        e3.employeeInfo();
    }
}
