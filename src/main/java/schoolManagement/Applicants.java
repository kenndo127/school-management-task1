package schoolManagement;

public class Applicants extends Person{
    protected int applicationID;

    public Applicants(String name, int age, int id, int applicationID) {
        super(name, age, id);
        this.applicationID = applicationID;
    }
}
