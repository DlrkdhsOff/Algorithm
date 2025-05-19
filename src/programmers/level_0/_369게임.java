package programmers.level_0;

public class _369게임 {

  public static void main(String[] args) {
    int order = 29423;
    System.out.println(solution(order));
  }

  public static int solution(int order) {
    String[] arr = String.valueOf(order).split("");

    int result = 0;

    for (String s : arr) {
      if(s.equals("3") || s.equals("6") || s.equals("9")) {
        result++;
      }

    }

    return result;
  }

}
