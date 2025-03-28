package programmers.level_1;

public class _3진법_뒤집기 {

  public static void main(String[] args) {
    int n = 45;

//    int n = 125;
    System.out.println(solution(n));
  }

  public static int solution(int n) {
    String reversed = new StringBuilder(Integer.toString(n, 3)).reverse().toString();

    return Integer.parseInt(reversed, 3);
  }

}
