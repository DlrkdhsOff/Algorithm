package programmers.level0;

import java.util.*;

public class 배열의_유사도 {
  public static void main(String[] args) {
    System.out.println(solution(new String[]{"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"}));
  }

  public static int solution(String[] s1, String[] s2) {
    Set<String> set = new HashSet<>(Arrays.asList(s1));

    return (int) Arrays.stream(s2).filter(set::contains).count();
  }

}
