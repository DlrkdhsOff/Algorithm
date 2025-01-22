package programmers.level0;

public class 피자_나눠먹기 {

  public static void main(String[] args) {
    System.out.println(solution(4, 12));
  }

  public static int solution(int slice, int n) {
    return n % slice > 0 ? n / slice + 1 : n / slice;
  }

}
