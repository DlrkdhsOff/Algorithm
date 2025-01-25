package programmers.level_1;

public class 가운데_글자_가지고오기 {

  public static void main(String[] args) {
    System.out.println(solution("abcde"));
  }


  public static String solution(String s) {

    int index = s.length() / 2;

    if(s.length() % 2 == 0) {
      return s.substring(index - 1, index + 1);
    }

    return s.substring(index, index + 1);
  }

}
