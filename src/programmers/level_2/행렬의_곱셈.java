package programmers.level_2;

import java.util.Arrays;

public class 행렬의_곱셈 {

  public static void main(String[] args) {

    int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
    int[][] arr2 = {{3, 3}, {3, 3}};

//    int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
//    int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
//
//    int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
//    int[][] arr2 = {{1, 4}, {2, 5}, {3, 6}};

    int[][] result = solution(arr1, arr2);

    for (int[] i : result) {
      System.out.println(Arrays.toString(i));
    }
    System.out.println();
  }

  public static int[][] solution(int[][] arr1, int[][] arr2) {
    int row = arr1.length;
    int col1 = arr1[0].length;
    int col2 = arr2[0].length;

    int[][] result = new int[row][col2];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col2; j++) {
        for (int k = 0; k < col1; k++) {
          result[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }

    return result;
  }
}