package schoolManagement;

public interface PrincipalDoable {
    void admitStaffApplicant(int age);
    void admitStudentApplicant(int age);
    void expelStudent(String name);
    void dismissStaff(String name);
}
