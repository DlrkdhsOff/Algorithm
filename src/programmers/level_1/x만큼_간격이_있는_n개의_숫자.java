package programmers.level_1;

import java.util.*;

public class x만큼_간격이_있는_n개의_숫자 {

  public static void main(String[] args) {
    System.out.println(solution(-4, 2));
  }

  public static List<Long> solution(int x, int n) {
    List<Long> result = new ArrayList<>();

    Long data = 0L;
    for(int i = 0; i < n; i++) {
      result.add(data += x);
    }

    return result;
  }
}
