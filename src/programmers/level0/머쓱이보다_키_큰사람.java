package programmers.level0;

import java.util.*;

public class 머쓱이보다_키_큰사람 {
  public static void main(String[] args) {
    System.out.println(solution(new int[] {149, 180, 192, 170}, 167));
  }

  public static int solution(int[] array, int height) {
    return (int) Arrays.stream(array)
        .filter(e -> e > height).count();
  }

}
