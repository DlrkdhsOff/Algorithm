package programmers.level_0;

public class 세로_읽기 {

  public static void main(String[] args) {
    String str = "ihrhbakrfpndopljhygc";
    int m = 4;
    int c = 2;

    System.out.println(solution(str, m, c));
  }

  public static String solution(String str, int m, int c) {

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i += m) {
      String s = str.substring(i, i + m);

      sb.append(s.charAt(c - 1));
    }

    return sb.toString();
  }

}
