/*
 A
 B B
 C C C
 D D D D
 E E E E E
*/
import java.util.Scanner;

class Pattern_22 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");
    int row = sc.nextInt();
    char ch = 'A';
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
      }
      System.out.println("");
      ch++;
    }
  }
}
