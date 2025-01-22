package programmers.level0;

public class 문자_반복_출력하기 {

  public static void main(String[] args) {
    System.out.println(solution("hello", 3));
  }

  public static String solution(String my_string, int n) {
    StringBuilder sb = new StringBuilder();

    for(String s : my_string.split("")) {
      sb.append(s.repeat(n));
    }

    return sb.toString();
  }

}
