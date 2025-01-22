package programmers.level_1;

public class 두_정수_사이의_합 {

  public static void main(String[] args) {
    System.out.println(solution(3, 5));
  }

  public static long solution(int a, int b) {
    long answer = 0;

    if(a > b) {
      int tmp = a;
      a = b;
      b = tmp;
    }

    while(a <= b) {
      answer += a;
      a++;
    }

    return answer;
  }

}
