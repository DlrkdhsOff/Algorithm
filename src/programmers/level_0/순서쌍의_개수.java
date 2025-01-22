package programmers.level_0;

import java.util.stream.IntStream;

public class 순서쌍의_개수 {

  public static void main(String[] args) {
    System.out.println(solution1(20));
    System.out.println(solution2(20));
  }

  public static int solution1(int n) {
    int answer = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        answer++;
      }
    }

    return answer;
  }

  public static int solution2(int n) {
    return (int) IntStream.rangeClosed(1, n)
        .filter(i -> n % i == 0).count();
  }



}
