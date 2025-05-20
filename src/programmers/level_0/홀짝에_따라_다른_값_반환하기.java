package programmers.level_0;

public class 홀짝에_따라_다른_값_반환하기 {

  public static void main(String[] args) {
    int n = 10;

    System.out.println(solution(n));
  }

  public static int solution(int n) {
    int answer = 0;
    for (int i = n; i >= 1; i -= 2) {
      answer += (i % 2 == 0) ? i * i : i;
    }

    return answer;
  }

}
