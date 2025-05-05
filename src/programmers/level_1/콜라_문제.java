package programmers.level_1;

public class 콜라_문제 {

  public static void main(String[] args) {
    System.out.println(solution(2, 1, 20));
  }

  public static int solution(int a, int b, int n) {
    return (n > b ? n - b : 0) / (a - b) * b;
  }

}
