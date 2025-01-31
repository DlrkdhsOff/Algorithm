package programmers.level_1;

public class 핸드폰_번호_가리기 {

  public static void main(String[] args) {
    System.out.println(solution("01033334444"));
  }

  public static String solution(String phone_number) {
    int length = phone_number.length();

    return phone_number.substring(0, length - 4)
        .replaceAll("[0-9]", "*") + phone_number.substring(length - 4);
  }

}
