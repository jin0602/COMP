package assignment2.staff;

import java.util.ArrayList;
import java.util.List;

public class Staff {

  static List<Staff> StaffList = new ArrayList<Staff>();
  static int nextId = 1;

  private final int id;
  private String name;
  private int birthYear;
  private String gender;
  private int yearOfJoining;
  private int salary;

  Staff(String name, int birthyear, String gender, int yearofjoining, int salary) {
    this.id = nextId++;
    this.name = name;
    this.birthYear = birthyear;
    this.gender = gender;
    this.yearOfJoining = yearofjoining;
    this.salary = salary;
    StaffList.add(this);
  }

  public int getId() {
    return id;
  }
}
