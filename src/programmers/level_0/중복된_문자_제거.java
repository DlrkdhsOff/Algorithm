package programmers.level_0;

public class 중복된_문자_제거 {
  public static void main(String[] args) {
    String my_string = "people";

    System.out.println(solution(my_string));
  }

  public static String solution(String my_string) {
    StringBuilder result = new StringBuilder();

    for(String str : my_string.split("")) {
      if(result.toString().contains(str)) {
        continue;
      }
      result.append(str);
    }

    return result.toString();
  }

}
