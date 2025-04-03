package assignment2.staff;

import java.util.List;

public class StaffController {

  public List<Staff> getStudentList() {
    return Staff.StaffList;
  }

  public Staff getStudent(int id) {
    return Staff.StaffList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
  }

  public void removeStudent(int id) {
    Staff.StaffList.removeIf(x -> x.getId() == id);
  }

}
