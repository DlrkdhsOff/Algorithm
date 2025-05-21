package programmers.level_0;

import java.util.*;

public class n의_배수_고르기 {

  public static void main(String[] args) {
    int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
    int n = 3;

    System.out.println(Arrays.toString(solution(n, numlist)));
  }

  public static int[] solution(int n, int[] numlist) {

    return Arrays.stream(numlist)
        .filter(i -> i % n == 0)
        .toArray();
  }

}
