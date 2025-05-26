package programmers.level_1;

public class 카드_뭉치 {

  public static void main(String[] args) {
    String[] cards1 = {"i", "water", "drink"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};

    System.out.println(solution(cards1, cards2, goal));
  }

  public static String solution(String[] cards1, String[] cards2, String[] goal) {
    int cur1 = 0;
    int cur2 = 0;

    String answer = "Yes";

    for (String s : goal) {
      if (cur1 < cards1.length && cards1[cur1].equals(s)) {
        cur1++;
      } else if (cur2 < cards2.length && cards2[cur2].equals(s)) {
        cur2++;
      } else {
        answer = "No";
        break;
      }
    }
    return answer;

  }

}
