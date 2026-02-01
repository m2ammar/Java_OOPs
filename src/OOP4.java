class Car{
    String brand;
    String model;
    int year;
    int mileage;

    public void info(){
        System.out.print(this.brand+" ");
        System.out.print(this.model+" ");
        System.out.print(this.mileage+" ");
        System.out.print(this.year+" ");
    }

    //parameterised constructor
    Car(String name, String model, int mileage, int year){
        this.brand=name;
        this.model=model;
        this.mileage=mileage;
        this.year=year;
    }

    public void drive(int distance){
        this.mileage += distance;
    }

    public int age(){
        return 2026- this.year;
    }
}

public class OOP4 {
    public static void main(String[] args) {

        Car c1 = new Car("Honda", "Civic", 1444, 2026);

        c1.info();
    }
}
