package schoolManagement;

import java.util.List;

public class Class {
    private String className;
    private Teacher classTeacher;
    private List<Student> students;

    public Class(String className, Teacher classTeacher, List<Student> students) {
        this.className = className;
        this.classTeacher = classTeacher;
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public List<Student> getStudents() {
        return students;
    }
}

