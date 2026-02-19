package schoolManagement;

public class StudentApplicant extends Applicants implements Appliable{
    public StudentApplicant(String name, int age, int id, int applicationID) {
        super(name, age, id, applicationID);
    }

    @Override
    public void apply(String currentClass) {
        System.out.println(name + " is applying to " + currentClass);
    }
}
