package programmers.level_1;

public class 수박수박수박수박수박수 {

  public static void main(String[] args) {
    System.out.println(solution(5));
  }

  public static String solution(int n) {
    if(n == 0) {
      return "";
    }

    StringBuilder sb = new StringBuilder("수박".repeat(n / 2));

    return n % 2 == 0? sb.toString() : sb.append("수").toString();
  }

}
