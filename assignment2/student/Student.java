package assignment2.student;

import assignment2.Member;
import java.util.ArrayList;
import java.util.List;

public class Student extends Member {

  static List<Student> studentList = new ArrayList<Student>();
  static int nextId = 1;

  private final int id;
  private int yearOfAdmission;
  private int grade;

  public Student(String name, int birthyear, String gender, int yearofadmission, int grade) {
    super(name, birthyear, gender);
    this.id = nextId++;
    this.yearOfAdmission = yearofadmission;
    this.grade = grade;
    studentList.add(this);
  }

  @Override
  public String toString() {
    if (studentList.isEmpty()) {
      return "No student found";
    } else {
      return "name=" + this.name +
          ", birthYear=" + this.birthYear +
          ", gender=" + this.gender +
          ", yearOfAdmission=" + this.yearOfAdmission +
          ", grade=" + this.grade;
    }
  }

  public int getId() {
    return id;
  }
}
