package programmers.level_0;

public class 문자_리스트를_문자열로_변환하기 {
  public static void main(String[] args) {
    String[] arr = {"a", "b", "c"};

    System.out.println(solution(arr));
  }

  public static String solution(String[] arr) {
    return String.join("", arr);
  }

}
