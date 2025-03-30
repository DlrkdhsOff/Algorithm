package programmers.level_2;

import java.util.Arrays;

public class 삼각_달팽이 {

  public static void main(String[] args) {
    int n = 6;

//    int n = 10;
    System.out.println(Arrays.toString(solution(n)));
  }

  public static int[] solution(int n) {
    int[] result = new int[n * (n + 1) / 2];
    int[][] arr = new int[n][n];

    int row = -1;
    int col = 0;
    int num = 1;


    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {

        switch (i % 3) {
          case 0:
            arr[++row][col] = num++;
            break;
          case 1:
            arr[row][++col] = num++;
            break;
          case 2:
            arr[--row][--col] = num++;
            break;
        }
      }
    }

    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] != 0) {
          result[index++] = arr[i][j];
        }
      }
    }

    return result;
  }
}
