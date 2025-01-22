package programmers.level0;

import java.util.*;
import java.util.stream.*;

public class 배열_원소의_길이 {

  public static void main(String[] args) {
    System.out.println(solution(new String[] {"We", "are", "the", "world!"}));
  }

  public static List<Integer> solution(String[] strlist) {
    return Arrays.stream(strlist)
        .map(String :: length)
        .collect(Collectors.toList());
  }

}
