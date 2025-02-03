package programmers.level_1;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(4, 6)));
  }

  public static int[] solution(int n, int m) {
    int[] result = new int[2];

    result[0] = GCD(n, m);
    result[1] = n * m / result[0];
    return result;
  }

  public static int GCD(int n, int m) {
    return m == 0 ? n : GCD(m, n % m);
  }

}
