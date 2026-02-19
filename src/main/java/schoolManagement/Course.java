package schoolManagement;

import java.util.List;

public class Course {
    private int courseID;
    private String Course;
    private Teacher teacher;
    private List<Student> students;

    public Course(int courseID, String course, List<Student> students) {
        this.courseID = courseID;
        Course = course;
        this.teacher = new Teacher();
        this.students = students;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourse() {
        return Course;
    }

    public Teacher getTeachers() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }
}
