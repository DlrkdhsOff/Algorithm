package programmers.level0;

import java.util.*;

public class 배열_자르기 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
  }

  public static int[] solution(int[] numbers, int num1, int num2) {
    return Arrays.copyOfRange(numbers, num1, num2 + 1);
  }

}
