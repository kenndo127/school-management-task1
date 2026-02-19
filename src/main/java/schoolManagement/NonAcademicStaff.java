package schoolManagement;

public class NonAcademicStaff extends Staff implements Doable{
    public NonAcademicStaff(String name, int age, int id, double salary){
        super(name, age, id, salary);
    }

    public void performDuty(String duty){
        System.out.println(name + " is " + duty);
    }
}
