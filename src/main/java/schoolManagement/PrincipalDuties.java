package schoolManagement;

public class PrincipalDuties implements PrincipalDoable{
    @Override
    public void admitStaffApplicant(int age) {
        System.out.println((age < 18) ? "Can't be employed" : "You have been employed");
    }

    @Override
    public void admitStudentApplicant(int age) {
        System.out.println((age > 10) ? "You are have beed admitted" : "Not admitted");
    }

    @Override
    public void expelStudent(String name){
        System.out.println(name + " has been expelled!");
    }

    @Override
    public void dismissStaff(String name) {
        System.out.println(name + " has been dismissed!");
    }
}
