package schoolManagement;

public class NonAcademicStaff extends Staff implements NonAcademicStaffDoable {
    private String duty;
    public NonAcademicStaff(String name, int age, int id, double salary, String duty){
        super(name, age, id, salary);
        this.duty = duty;
    }

    public String duty(){ return duty; }

    public void performDuty(String duty){
        System.out.println(name + " is " + duty);
    }
}
