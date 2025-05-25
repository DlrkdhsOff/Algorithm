package programmers.level_0;

import java.util.Arrays;

public class 문자열_정렬하기_1 {
  public static void main(String[] args) {
    String my_string = "hi12392";

    System.out.println(Arrays.toString(solution(my_string)));
  }

  public static int[] solution(String my_string) {
    return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "")
        .split(""))
        .sorted()
        .mapToInt(Integer::parseInt)
        .toArray();
  }

}
