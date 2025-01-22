package programmers.level_1;

import java.util.stream.IntStream;

public class 약수의_합 {

  public static void main(String[] args) {
    System.out.println(solution(10));
  }

  public static int solution(int n) {
    return (int) IntStream.rangeClosed(1, n)
        .filter(i -> n % i == 0).sum();
  }

}
