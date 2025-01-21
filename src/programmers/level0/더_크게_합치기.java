package programmers.level0;

public class 더_크게_합치기 {
  public static void main(String[] args) {

    System.out.println(solution(1, 23));
  }

  public static int solution(int a, int b) {
    int A = Integer.parseInt(a + "" + b);
    int B = Integer.parseInt(b + "" + a);

    return Math.max(A, B);
  }

}
