package programmers.level_1;

public class 문자열_내_p와_y의_개수 {

  public static void main(String[] args) {
    String s = "pPoooyY";

//    String s = "Pyy";

    System.out.println(solution(s));
  }

  public static boolean solution(String s) {
    int p = 0;
    int y = 0;

    for(String str : s.toLowerCase().split("")) {
      if(str.equals("p")) p++;
      else if(str.equals("y")) y++;
    }

    return p == y;
  }

}
