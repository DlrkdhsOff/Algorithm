package programmers.level_1;

import java.util.Arrays;

public class 평균_구하기 {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{4, 5, 6, 7}));
  }

  public static double solution(int[] arr) {
    return Arrays.stream(arr).average().orElse(0);
  }

}
