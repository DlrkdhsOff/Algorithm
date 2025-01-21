package programmers.level0;

import java.util.Scanner;

public class 홀짝_구분하기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String str = n % 2 == 0 ? "is even" : "is odd";

    System.out.println(n + " " + str);
  }

}
