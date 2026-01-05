package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class OtherStreamApi {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1,"Abhishek", 55.55),
                new Student(2,"Bob", 98.2),
                new Student(3,"Cal", 65)
        );

        //Find Topper
        Student topper = students.stream().sorted((student1, student2) -> (int) (student2.getMarks() - student1.getMarks())).findFirst().orElse(null);

        System.out.println(topper.getName());
    }
}
