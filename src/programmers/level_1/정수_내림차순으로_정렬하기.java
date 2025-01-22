package programmers.level_1;

import java.util.Arrays;

public class 정수_내림차순으로_정렬하기 {

  public static void main(String[] args) {
    System.out.println(solution(5238231));
  }

  public static long solution(long n) {
    char[] arr = String.valueOf(n).toCharArray();

    Arrays.sort(arr);

    return Long.parseLong(new StringBuilder(new String(arr))
        .reverse().toString());
  }

}
