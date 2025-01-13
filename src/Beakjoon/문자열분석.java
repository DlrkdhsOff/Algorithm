package Beakjoon;

import java.io.*;

public class 문자열분석 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str;
    while((str = br.readLine()) != null) {
      int[] result = new int[4];

      for (char c : str.toCharArray()) {
        if (Character.isLowerCase(c)) {
          result[0]++;
        } else if (Character.isUpperCase(c)) {
          result[1]++;
        } else if (Character.isDigit(c)) {
          result[2]++;
        } else {
          result[3]++;
        }
      }

      for (int i : result) {
        bw.write(i + " ");
      }
      bw.write("\n");
      bw.flush();
    }
  }

}