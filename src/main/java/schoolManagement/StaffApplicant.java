package schoolManagement;

public class StaffApplicant extends Applicants implements Appliable{
    public StaffApplicant(String name, int age, int id, int applicationID) {
        super(name, age, id, applicationID);
    }

    @Override
    public void apply(String role){
        System.out.println(name + " is applying to be a " + role);
    }
}
