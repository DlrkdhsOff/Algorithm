package programmers;

public class 공배수 {
  public static void main(String[] args) {
    System.out.println(solution(50, 5, 10));
  }

  public static int solution(int number, int n, int m) {
    return (number % n == 0) && (number % m == 0) ? 1 : 0;
  }

}
