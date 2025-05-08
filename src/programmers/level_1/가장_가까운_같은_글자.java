package programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 가장_가까운_같은_글자 {

  public static void main(String[] args) {
    String s = "banana";
    System.out.println(Arrays.toString(solution(s)));
  }

  public static int[] solution(String s) {
    List<String> list = new ArrayList<>();

    String[] str = s.split("");
    int[] answer = new int[str.length];
    for (int i = 0; i < str.length; i++) {
      if (list.contains(str[i])) {
        answer[i] = i - list.lastIndexOf(str[i]);
      } else {
        answer[i] = -1;
      }
      list.add(str[i]);

    }

    return answer;
  }

}
