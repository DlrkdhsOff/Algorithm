package programmers.level_0;

import java.util.Arrays;

public class 아이스_아메리카노 {

  public static void main(String[] args) {
    int money = 15000;

    System.out.println(Arrays.toString(solution(money)));
  }

  public static int[] solution(int money) {
    int[] answer = new int[2];

    answer[0] = money / 5500;
    answer[1] = money % 5500;

    return answer;
  }

}
