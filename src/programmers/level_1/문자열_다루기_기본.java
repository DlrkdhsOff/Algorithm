package programmers.level_1;

public class 문자열_다루기_기본 {

  public static void main(String[] args) {
    System.out.println(solution("1234"));

  }


  public static boolean solution(String s) {
    if(s.length() == 4 || s.length() == 6) {
      String[] arr = s.split("[^A-z]");

      if(arr.length == 0) {
        return true;
      }
    }

    return false;
  }

}
