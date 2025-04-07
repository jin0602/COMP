package assignment2.staff;

import assignment2.Member;
import java.util.ArrayList;
import java.util.List;

public class Staff extends Member {

  static List<Staff> staffList = new ArrayList<Staff>();
  static int nextId = 1;

  private final int id;
  private int yearOfJoining;
  private int salary;

  public Staff(String name, int birthyear, String gender, int yearofjoining, int salary) {
    super(name, birthyear, gender);
    this.id = nextId++;
    this.yearOfJoining = yearofjoining;
    this.salary = salary;
    staffList.add(this);
  }

  @Override
  public String toString() {
    if (staffList.isEmpty()) {
      return "No staff found";
    } else {
      return "name=" + this.name +
          ", birthYear=" + this.birthYear +
          ", gender=" + this.gender +
          ", yearOfJoining=" + this.yearOfJoining +
          ", salary=" + this.salary;
    }
  }

  public int getId() {
    return id;
  }
}
