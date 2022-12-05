public class Teacher extends Person {
    int salary;
    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void display() {
        super.display();
        System.out.println(this);
        System.out.println("---");
    }
    @Override
    public String toString() {
        return "Teacher [salary=" + salary + "]";
    }
}