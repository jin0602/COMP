package assignment2.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

  static List<Student> studentList = new ArrayList<Student>();
  static int nextId = 1;

  private final int id;
  private String name;
  private int birthYear;
  private String gender;
  private int yearOfAdmission;
  private int grade;

  Student(String name, int birthyear, String gender, int yearofadmission, int grade) {
    this.id = nextId++;
    this.name = name;
    this.birthYear = birthyear;
    this.gender = gender;
    this.yearOfAdmission = yearofadmission;
    this.grade = grade;
    studentList.add(this);
  }

  public int getId() {
    return id;
  }
}
