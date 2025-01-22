package programmers.level_0;

public class 양꼬치 {

  public static void main(String[] args) {

    System.out.println(solution(10, 5));
  }

  public static int solution(int n, int k) {

    return (n * 12000) + ((k - n / 10) * 2000);
  }

}
