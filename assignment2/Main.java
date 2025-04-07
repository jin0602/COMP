package assignment2;


import assignment2.staff.StaffController;
import assignment2.student.StudentController;
import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    StudentController studentController = new StudentController();
    StaffController staffController = new StaffController();
    boolean flag = false;
    int operation, gSelect, id;
    while (true) {
      operation = input("Please select your operation:\n1.remove\n2.add\n3.list\n4.find");
      gSelect = input("Please select a category:\n1.staff\n2.student");
      switch (operation) {
        case 1://remove
          id = input("Please enter the ID you would like to remove: ");
          if (gSelect == 1) {
            staffController.removeStaff(id);
          } else {
            studentController.removeStudent(id);
          }
          break;
        case 2://add
          if (gSelect == 1) {
            System.out.println(
                "Please enter the information you want to add (name, birth year, gender, year of joining, salary): ");
            String[] vars = sc.nextLine().split(",");
            staffController.addStaff(vars);
          } else {
            System.out.println(
                "Please enter the information you want to add (name, birth year, gender, year of joining, salary): ");
            String[] vars = sc.nextLine().split(",");
            studentController.addStudent(vars);
          }
          break;
        case 3://list
          if (gSelect == 1) {
            staffController.getStaffList().forEach(s -> System.out.println(s.toString()));
          } else {
            System.out.println(studentController.getStudentList());
          }
          break;
//        case 4://find
//          if (gSelect == 1) {
//            System.out.println(staffController.getStaffList());
//          } else {
//            System.out.println(studentController.getStudentList());
//          }
//          break;
        default://else
          System.out.println("Please enter a valid option!");
          flag = true;
          break;
      }
      if (flag) {
        break;
      }
    }
  }

  public static int input(String question) {
    int answer = 0;
    System.out.println(question);
    while (true) {
      if (sc.hasNextInt()) {
        answer = sc.nextInt();
        sc.nextLine();
        break;
      } else {
        System.out.println("Please enter a valid number.");
      }
    }
    return answer;
  }

}
