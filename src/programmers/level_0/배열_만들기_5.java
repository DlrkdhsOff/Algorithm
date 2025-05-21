package programmers.level_0;

import java.util.Arrays;

public class 배열_만들기_5 {
  public static void main(String[] args) {
    String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
    int k = 50000;
    int s = 5;
    int l = 5;

    System.out.println(Arrays.toString(solution(intStrs, k, s, l)));

  }

  public static int[] solution(String[] intStrs, int k, int s, int l) {

    return Arrays.stream(intStrs)
        .mapToInt(str -> Integer.parseInt(str.substring(s, s + l)))
        .filter(num -> num > k).toArray();
  }

}
