package programmers.level0;

import java.util.stream.IntStream;

public class 짝수의_합 {

  public static void main(String[] args) {
    System.out.println(solution(18));
  }

  public static int solution(int n) {
    return IntStream.rangeClosed(0, n).filter(num -> num % 2 == 0).sum();
  }

}
