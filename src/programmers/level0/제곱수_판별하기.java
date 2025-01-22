package programmers.level0;

public class 제곱수_판별하기 {

  public static void main(String[] args) {
    System.out.println(solution(144));
  }

  public static int solution(int n) {

    return n % Math.sqrt(n) == 0 ? 1 : 2;
  }

}
