package programmers.level_0;

public class 대문자로_바꾸기 {

  public static void main(String[] args) {
    String myString = "aBcDeFg";

    System.out.println(solution(myString));
  }

  public static String solution(String myString) {
    return myString.toUpperCase();
  }

}
