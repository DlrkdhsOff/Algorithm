package programmers.level_0;

public class 세균증식 {

  public static void main(String[] args) {
    System.out.println(solution(2, 10));
  }

  public static int solution(int n, int t) {
    for(int i = 0; i < t; i++) {
      n *= 2;
    }

    return n;
  }

}
