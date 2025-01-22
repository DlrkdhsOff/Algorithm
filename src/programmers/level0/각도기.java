package programmers.level0;

public class 각도기 {

  public static void main(String[] args) {
    System.out.println(solution(98));
  }

  public static int solution(int angle) {
    return angle < 90 ? 1 : angle == 90 ? 2 : angle < 180 ? 3 : 4;
  }

}
