package schoolManagement;

public class Staff extends Person{
    protected double salary;

    public Staff(String name, int age, int id, double salary){
        super(name, age, id);
        this.salary = salary;
    }

    public Staff(){}
}
