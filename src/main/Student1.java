package main;

public class Student1 extends Person {
    private String course;
    private int roll_no;

    public Student1(String name, int age, char gender, String course, int rollno) {
        super(name, age, gender);
        this.course = course;
        this.roll_no = rollno;
    }

    @Override
    public String toString() {
        return super.toString() + "\nI Study in " + course + " and my roll no. is" + roll_no;
    }
}
