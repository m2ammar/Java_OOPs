class person {

    public String name;
    private int balance;
    protected int age;

}

public class OOP9 {
    public static void main(String[] args) {

        person p1= new person();

        p1.name="Ammar";
        p1.age=55;
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}
