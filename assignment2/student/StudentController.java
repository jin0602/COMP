package assignment2.student;

import java.util.Arrays;
import java.util.List;

public class StudentController {

  public List<Student> getStudentList() {
    return Student.studentList;
  }

  public void removeStudent(int id) {
    Student.studentList.removeIf(x -> x.getId() == id);
  }

  public void addStudent(String[] vars) {
    vars = Arrays.stream(vars)
        .map(s -> s.trim())
        .toArray(String[]::new);
    new Student(vars[0], Integer.parseInt(vars[1]), vars[2], Integer.parseInt(vars[3]),
        Integer.parseInt(vars[4]));
  }
}
