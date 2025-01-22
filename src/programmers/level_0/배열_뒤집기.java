package programmers.level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열_뒤집기 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
  }

  public static int[] solution(int[] num_list) {
    return IntStream.range(0, num_list.length)
        .map(e -> num_list[num_list.length -1 - e])
        .toArray();
  }

}
