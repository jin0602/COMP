package assignment2.student;

import java.util.List;

public class StudentController {

  public List<Student> getStudentList() {
    return Student.studentList;
  }

  public Student getStudent(int id) {
    return Student.studentList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
  }

  public void removeStudent(int id) {
    Student.studentList.removeIf(x -> x.getId() == id);
  }
}
