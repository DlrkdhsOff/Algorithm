package programmers.level_1;

public class 문자열_다루기_기본 {

  public static void main(String[] args) {
    String s = "a234";

//    String s = "1234";

    System.out.println(solution("s"));

  }

  public static boolean solution(String s) {
    if(s.length() == 4 || s.length() == 6) {
      String[] arr = s.split("[^A-z]");

      return arr.length == 0;
    }

    return false;

  }

}
