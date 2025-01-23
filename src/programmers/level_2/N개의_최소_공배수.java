package programmers.level_2;

public class N개의_최소_공배수 {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{2, 6, 8, 14}));
  }

  public static int solution(int[] arr) {
    int prev = arr[0];

    for(int i = 1; i < arr.length; i++) {
      prev = LCM(prev, arr[i]);
    }

    return prev;
  }

  public static int GCD(int a, int b) {
    return b == 0 ? a : GCD(b, a % b);
  }

  public static int LCM(int a, int b) {
    return a * b / GCD(a, b);
  }

}
