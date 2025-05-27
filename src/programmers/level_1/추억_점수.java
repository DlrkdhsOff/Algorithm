package programmers.level_1;

import java.util.Arrays;

public class 추억_점수 {

  public static void main(String[] args) {
    String[] name = {"may", "kein", "kain", "radi"};
    int[] yearning = {5, 10, 1, 3};
    String[][] photo = {
        {"may", "kein", "kain", "radi"},
        {"may", "kein", "brin", "deny"},
        {"kon", "kain", "may", "coni"}
    };

    System.out.println(Arrays.toString(solution(name, yearning, photo)));
  }

  public static int[] solution(String[] name, int[] yearning, String[][] photo) {
    int[] answer = new int[photo.length];

    for (int i = 0; i < photo.length; i++) {
      for (int j = 0; j < photo[i].length; j++) {
        for(int k = 0; k < name.length; k++) {
          if(name[k].equals(photo[i][j])) {
            answer[i] += yearning[k];
          }
        }
      }
    }
    return answer;
  }

}
