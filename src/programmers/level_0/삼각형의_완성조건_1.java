package programmers.level_0;

import java.util.Arrays;

public class 삼각형의_완성조건_1 {

  public static void main(String[] args) {
    int[] sides = {199, 72, 222};

    System.out.println(solution(sides));
  }

  public static int solution(int[] sides) {
    Arrays.sort(sides);

    return sides[0] + sides[1] > sides[2] || sides[0] == sides[1] && sides[1] == sides[2] ? 1 : 2;
  }

}
