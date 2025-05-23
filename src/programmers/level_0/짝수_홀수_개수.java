package programmers.level_0;

import java.util.Arrays;

public class 짝수_홀수_개수 {

  public static void main(String[] args) {
    int[] num_list = {1, 2, 3, 4, 5};

    System.out.println(Arrays.toString(solution(num_list)));
  }

  public static int[] solution(int[] num_list) {
    int[] answer = new int[2];

    answer[0] = (int) Arrays.stream(num_list).filter(e -> e % 2 == 0).count();
    answer[1] = (int) Arrays.stream(num_list).filter(e -> e % 2 != 0).count();

    return answer;
  }


}
