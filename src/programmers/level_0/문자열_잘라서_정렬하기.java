package programmers.level_0;

import java.util.*;

public class 문자열_잘라서_정렬하기 {

  public static void main(String[] args) {
    String myString = "axxbxx";

    System.out.println(Arrays.toString(solution(myString)));
  }

  public static String[] solution(String myString) {
    List<String> list = new ArrayList<>();

    for (String s : myString.split("x")) {
      if(s.isEmpty()) continue;
      list.add(s);
    }

    Collections.sort(list);

    return list.toArray(new String[list.size()]);
  }

}
