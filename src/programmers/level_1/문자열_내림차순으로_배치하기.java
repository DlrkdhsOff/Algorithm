package programmers.level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 문자열_내림차순으로_배치하기 {

  public static void main(String[] args) {
    System.out.println(solution("Zbcdefg"));
  }


  public static String solution(String s) {
    return Arrays.stream(s.split(""))
        .sorted(Collections.reverseOrder())
        .collect(Collectors.joining());
  }

}
