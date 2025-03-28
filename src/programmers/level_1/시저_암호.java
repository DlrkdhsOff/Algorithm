package programmers.level_1;

public class 시저_암호 {

  public static void main(String[] args) {
    String s = "AB";
    int n = 1;

//    String s = "z";
//    int n = 1;

//    String s = "a B z";
//    int n = 4;

    System.out.println(solution(s, n));
  }

  public static String solution(String s, int n) {
    StringBuilder sb = new StringBuilder();

    for(char c : s.toCharArray()) {
      if(c != ' ') {
        if(c <= 90) {
          sb.append((char)(c + n > 'Z' ? c + n - 26 : c + n));
        }else{
          sb.append((char)(c + n > 'z' ? c + n - 26 : c + n));
        }
      }else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

}
