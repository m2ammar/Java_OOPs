class Employees{

    double calculateBonus(){
        return 0;
    }
}

class FullTimeEmployee extends Employees{

    int salary=30;

    @Override
    public double calculateBonus(){
        int bonus=salary+(salary*20/100);
        return bonus;
    }
}

class PartTimeEmployee extends Employees{
    int hourlyRate=20;

    @Override
    public double  calculateBonus(){
        int rate=hourlyRate*50;
        return rate;
    }
}

public class OOP7 {
    public static void main(String[] args) {

        //Employees → reference type (what the compiler sees
        Employees e1= new FullTimeEmployee();//new FullTimeEmployee() → actual object (what exists at runtime)
        //Java says “I’ll treat this object as an Employees,
        //but at runtime I’ll check what it really is.”
        System.out.println(e1.calculateBonus());

        Employees p1 =new PartTimeEmployee();
        System.out.println(p1.calculateBonus());
    }
}
