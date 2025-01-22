package programmers.level_1;

public class 하샤드_수 {

  public static void main(String[] args) {
    System.out.println(solution(12));
  }

  public static boolean solution(int x) {
    int sum = String.valueOf(x).chars()
        .map(c -> c - '0')
        .sum();

    return x % sum == 0;
  }
}
