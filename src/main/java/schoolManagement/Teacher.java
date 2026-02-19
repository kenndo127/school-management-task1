package schoolManagement;

public class Teacher extends AcademicStaff implements Teachable{
    private Course course;

    public Teacher(String name, int age, int id, double salary, Course course) {
        super(name, age, id, salary);
        this.course = course;
    }

    public Teacher(){}

    @Override
    public void teachCourse(Course course){
        System.out.println(name + " is teaching " + course);
    }
}
