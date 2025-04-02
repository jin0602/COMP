import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = 0;
    while (true) {
      i++;
      if (i % 2 == 1) {
        int c = checkc(i);
        if (c == 0) {
          System.out.println(i);
        } else {
          for (int j = 1; j < c; j++) {
            System.out.print('c');
          }
          System.out.println('c');
        }
      } else {
        int c = checkc(i);
        String ans = "";
        String user = in.nextLine();
        if (c == 0) {
          if (!(user.equals(Integer.toString(i)))) {
            break;
          }
        } else {
          for (int j = 0; j < c; j++) {
            ans = ans.concat("c");
          }
          if (!user.equals(ans)) {
            break;
          }
        }
      }
    }
    System.out.println("Game over!");
  }

  public static int checkc(int num) {
    int cCount = 0;
    int temp = 0;
    while (num > 0) {
      temp = num % 10;
      num = num / 10;
      if (temp % 3 == 0 && temp != 0) {
        cCount++;
      }
    }
    return cCount;
  }
}