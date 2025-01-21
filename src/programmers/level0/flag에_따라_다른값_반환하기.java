package programmers.level0;

public class flag에_따라_다른값_반환하기 {
  public static void main(String[] args) {
    System.out.println(solution(1, 3, true));
  }

  public static int solution(int a, int b, boolean flag) {
    return flag ? a + b : a - b;
  }

}
