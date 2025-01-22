package programmers.level_1;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{4, 2, 1, 3})));
  }

  public static int[] solution(int[] arr) {

    int min = Arrays.stream(arr).min().orElse(0);

    int[] result = Arrays.stream(arr).filter(i -> i != min).toArray();

    if(result.length == 0) {
      return new int[]{-1};
    }

    return result;
  }

}
