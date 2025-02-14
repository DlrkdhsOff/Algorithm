package programmers.level_1;

import java.util.Arrays;
import java.util.Comparator;

public class 정수_내림차순으로_배치하기 {

  public static void main(String[] args) {
    System.out.println(solution(118372));
  }

  public static long solution(long n) {
    String[] arr = String.valueOf(n).split("");
    Arrays.sort(arr, Comparator.reverseOrder());

    return Long.parseLong(String.join("", arr));
  }

}
