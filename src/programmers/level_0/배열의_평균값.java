package programmers.level_0;

import java.util.Arrays;

public class 배열의_평균값 {
  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

  }

  public static double solution(int[] numbers) {

    return Arrays.stream(numbers).average().orElse(0);
  }

}
