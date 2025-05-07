package programmers.level_1;

public class 크기가_작은_부분문자열 {

  public static void main(String[] args) {
    String t = "3141592";
    String p = "271";

    System.out.println(solution(t, p));
  }


  public static int solution(String t, String p) {
    int result = 0;

    int index = 0;
    while (index <= t.length() - p.length()) {

      long numT = Long.parseLong(t.substring(index, index + p.length()));

      if (numT <= Long.parseLong(p)) {
        result++;
      }

      index++;
    }

    return result;
  }

}
