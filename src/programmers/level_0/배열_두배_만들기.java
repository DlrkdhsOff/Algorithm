package programmers.level_0;

import java.util.Arrays;

public class 배열_두배_만들기 {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 100, -99, 1, 2, 3};

    System.out.println(Arrays.toString(solution(numbers)));
  }

  public static int[] solution(int[] numbers) {
    return Arrays.stream(numbers).map(e -> e * 2).toArray();
  }

}
