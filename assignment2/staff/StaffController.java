package assignment2.staff;

import java.util.Arrays;
import java.util.List;

public class StaffController {

  public List<Staff> getStaffList() {
    return Staff.staffList;
  }

  public void removeStaff(int id) {
    Staff.staffList.removeIf(x -> x.getId() == id);
  }

  public void addStaff(String[] vars) {
    vars = Arrays.stream(vars)
        .map(s -> s.trim())
        .toArray(String[]::new);
    new Staff(vars[0], Integer.parseInt(vars[1]), vars[2], Integer.parseInt(vars[3]),
        Integer.parseInt(vars[4]));
  }
}
