package programmers.level_1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {

  public static void main(String[] args) {
    String[] strings = {"abce", "abcd", "cdx"};
    int n = 2;

    System.out.println(Arrays.toString(solution(strings, n)));
  }

  public static String[] solution(String[] strings, int n) {
    Arrays.sort(strings, Comparator
        .comparing((String s) -> s.charAt(n))
        .thenComparing(s -> s));

    return strings;
  }

}
