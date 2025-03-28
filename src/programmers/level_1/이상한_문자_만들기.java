package programmers.level_1;

public class 이상한_문자_만들기 {

  public static void main(String[] args) {
    System.out.println(solution("try hello world"));
  }

  public static String solution(String s) {
    StringBuilder sb = new StringBuilder();

    int index = 0;
    String[] arr = s.split("");

    for(String str : arr) {
      index = str.equals(" ") ? 0 : index + 1;
      sb.append(index % 2 == 0 ? str.toLowerCase() : str.toUpperCase());
    }
    return sb.toString();
  }

}
