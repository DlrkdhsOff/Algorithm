package programmers.level_1;

import java.util.Arrays;

public class 예산 {

  public static void main(String[] args) {
    int[] d = {1, 3, 2, 5, 4};
    int budget = 9;

    System.out.println(solution(d, budget));
  }

  public static int solution(int[] d, int budget) {
    int cur = 0;
    int answer = 0;

    Arrays.sort(d);

    for (int n : d) {
      if (cur + n > budget) {
        return answer;
      } else {
        cur += n;
        answer++;
      }
    }

    return answer;
  }

}
