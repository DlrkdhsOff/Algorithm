package programmers.level_2;

import java.util.Arrays;

public class 이진_변환_반복하기 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution("01110")));
  }

  public static int[] solution(String s) {
    int zero = 0;
    int binary = 0;

    while(!s.equals("1")) {
      int length = s.length();
      s = s.replace("0", "");

      int newLength = s.length();

      zero += (length - newLength);

      s = Integer.toBinaryString(newLength);
      binary++;
    }

    return new int[]{binary, zero};
  }

}
