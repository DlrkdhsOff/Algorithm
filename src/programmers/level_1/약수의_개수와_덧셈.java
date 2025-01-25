package programmers.level_1;

public class 약수의_개수와_덧셈 {

  public static void main(String[] args) {
    System.out.println(solution(13, 17));
  }

  public static int solution(int left, int right) {
    int result = 0;

    for(int i = left; i <= right; i++) {

      int count = 1;
      for(int j = 1; j <= i / 2; j++) {
        if(i % j == 0) {
          count++;
        }
      }
      result = count % 2 == 0 ? result + i : result - i;
    }
    return result;
  }

}
