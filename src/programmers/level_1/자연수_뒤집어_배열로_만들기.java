package programmers.level_1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(12345L)));
  }

  public static int[] solution(long n) {

    return new StringBuilder(String.valueOf(n))
        .reverse()
        .chars()
        .map(c -> c - '0')
        .toArray();
  }

}
