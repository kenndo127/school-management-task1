package schoolManagement;

public abstract class Person {
    protected String name;
    protected int age;
    protected int id;

    public Person(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Person(){}
}
