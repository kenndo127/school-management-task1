package schoolManagement;

public class Student extends Person implements StudentDoable{
    private Course course; // This can be a list of courses as an ideal student will not be taking one course

    public Student(String name, int age, int id, Course course) {
        super(name, age, id);
        this.course = course;
    }

    public Course getCourse(){ return course; }

    public void takeCourse(Course course){
        System.out.println(name + " is taking " + course);
    }
}
