package programmers.level_1;

import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
  }

  public static int[] solution(int[] arr, int divisor) {
    int[] result = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();

    if(result.length == 0) {
      result = new int[] {-1};
    }

    Arrays.sort(result);

    return result;
  }

}
