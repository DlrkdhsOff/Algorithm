package programmers.level0;

import java.util.Arrays;

public class 최대값_만들기 {
  public static void main(String[] args) {
    System.out.println(solution(new int[] {1, 2, 3, 4, 5}));
  }

  public static int solution(int[] numbers) {
    Arrays.sort(numbers);

    return numbers[numbers.length -1] * numbers[numbers.length -2];
  }

}
