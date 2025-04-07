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

  public Staff(String name, int birthYear, String gender, int yearOfJoining, int salary) {
    super(name, birthYear, gender);
    this.id = nextId++;
    this.yearOfJoining = yearOfJoining;
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
