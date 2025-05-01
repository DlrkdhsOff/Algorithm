package programmers.level_1;

import java.util.Arrays;

public class K번째수 {

  public static void main(String[] args) {

    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    System.out.println(Arrays.toString(solution(array, commands)));
  }

  public static int[] solution(int[] array, int[][] commands) {
    int[] result = new int[commands.length];

    for(int index = 0; index < commands.length; index++) {
      int[] arr = Arrays.copyOfRange(array, commands[index][0] -1, commands[index][1]);
      Arrays.sort(arr);

      result[index] = arr[commands[index][2] - 1];
    }

    return result;
  }

}
