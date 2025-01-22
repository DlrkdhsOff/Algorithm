package programmers.level0;

public class 모음_제거 {

  public static void main(String[] args) {
    System.out.println(solution("hello"));
  }

  public static String solution(String my_string) {
    return my_string.replaceAll("[aeiou]", "");
  }

}
