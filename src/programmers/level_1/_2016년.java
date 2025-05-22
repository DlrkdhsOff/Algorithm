package programmers.level_1;


public class _2016년 {
  public static int[] DAY_OF_MONTH = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
  public static String[] DAYS_OF_WEEK = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

  public static void main(String[] args) {
    int a = 5;
    int b = 24;

    System.out.println(solution(a, b));
  }

  public static String solution(int a, int b) {
    int day = b;

    for(int i = 0; i < a; i++) {
      day += DAY_OF_MONTH[i];
    }

    return DAYS_OF_WEEK[day % 7];
  }

}
