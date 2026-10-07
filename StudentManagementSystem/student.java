package StudentManagementSystem;

import java.util.Comparator;

public class student implements Comparable<student>, Comparator<student> {
    private String name;
    private String studentId;
    private String major;
    private int age;
    private int gpa;
    
    

    public student(String name, int age, String studentId, int gpa, String major) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", major='" + major + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(student other) {
        return Integer.compare(this.gpa, other.gpa);
    }

    @Override
    public int compare(student first, student second) {
        return Integer.compare(first.gpa, second.gpa);
    }
}