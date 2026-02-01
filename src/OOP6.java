class Shape {
    String color;

}
//INHERITANCE
//1 type
class Polygon extends Shape{
    int sides;
    public void displaySides() {
        System.out.println("This polygon has " + sides + " sides");
    }
}
//2 type
class Triangle extends Polygon{

    public void area(int l, int h){
        System.out.println((0.5*l*h));
    }
}

public class OOP6 {
    public static void main(String[] args) {

        Triangle t1= new Triangle();
        t1.area(2,5);
    }
}
