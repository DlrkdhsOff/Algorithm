package programmers.level_0;

import java.util.Arrays;

public class 중복된_숫자_개수 {

  public static void main(String[] args) {

    int[] array = {1, 1, 2, 3, 4, 5};
    int n = 1;

    System.out.println(solution(array, n));
  }

  public static int solution(int[] array, int n) {
    return (int) Arrays.stream(array).filter(e -> e == n).count();
  }


}
