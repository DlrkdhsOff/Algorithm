package programmers.level_1;

public class 정수_제곱근_판별 {

  public static void main(String[] args) {
    System.out.println(solution(121));
  }

  public static long solution(long n) {
    return n % Math.sqrt(n) == 0
        ? (long)Math.pow(Math.sqrt(n) + 1, 2)
        : -1;
  }

}
