package programmers.level_2;
import java.util.Arrays;

public class 거리두기_확인하기 {

  public static void main(String[] args) {
    String[][] places = {
        {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
        {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
        {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
        {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
        {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
    };

    System.out.println(Arrays.toString(solution(places)));
  }

  public static int[] solution(String[][] places) {
    int[] result = new int[5];

    for (int i = 0; i < 5; i++) {
      String[][] place = castArray(places, i);
      result[i] = distance(place);
    }

    return result;
  }
  public static String[][] castArray(String[][] places, int row) {
    String[][] place = new String[5][5];

    for (int i = 0; i < 5; i++) {
      String[] arr = places[row][i].split("");

      for (int j = 0; j < 5; j++) {
        place[i][j] = arr[j];
      }
    }
    return place;
  }


  public static int distance(String[][] place) {
    for (int i = 0; i < 5; i ++) {
      for (int j = 0; j < 5; j ++) {
        if (!validation(place, i, j)) {
          return 0;
        }
      }
    }
    return 1;
  }


  public static boolean validation(String[][] place, int row, int col) {

    for (int i = Math.max(0, row - 2); i <= Math.min(4, row + 2); i++) {
      for (int j = Math.max(0, col - 2); j <= Math.min(4, col + 2); j++) {

        int distance = Math.abs(row - i) + Math.abs(col - j);

        if (distance == 0 || distance > 2) continue;

        if (place[row][col].equals("P") && place[i][j].equals("P")) {
          switch (distance) {
            case 1:
              return false;
            case 2:
              if (row == i) {
                if (!place[row][(col + j) / 2].equals("X")) {
                  return false;
                }
              } else if (col == j) {
                if (!place[(row + i) / 2][col].equals("X")) {
                  return false;
                }
              } else {
                if (!place[row][j].equals("X") || !place[i][col].equals("X")) {
                  return false;
                }
              }
              break;
          }
        }
      }
    }
    return true;
  }
}