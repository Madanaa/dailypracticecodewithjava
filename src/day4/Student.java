package day4;

public class Student extends Person {
    private int rollNo;

    public Student(String name, int age,int rollNo) {
        super(name,age);
        this.rollNo = rollNo;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("RollNo: "+rollNo);
    }
}
