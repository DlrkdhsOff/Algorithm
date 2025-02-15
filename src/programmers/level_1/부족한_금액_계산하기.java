package programmers.level_1;

import java.util.stream.IntStream;

public class 부족한_금액_계산하기 {

  public static void main(String[] args) {
    System.out.println(solution(3, 20, 4));
  }

  public static long solution(int price, int money, int count) {
    long result = IntStream.rangeClosed(1, count)
        .mapToLong(i -> (long) i * price)
        .sum() - money;

    return result <= 0 ? 0 : result;
  }
}
