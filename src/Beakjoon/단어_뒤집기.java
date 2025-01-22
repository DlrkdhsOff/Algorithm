package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class 단어_뒤집기 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String[] input = br.readLine().split(" ");

      for (String str : input) {
        bw.write(flipString(str) + " ");
      }
      bw.write("\n");
    }

    bw.flush();
  }

  public static String flipString(String str) {
    if (str.length() == 1) {
      return str;
    } else {
      Stack<String> stack = new Stack<>();

      stack.addAll(Arrays.asList(str.split("")));

      StringBuilder sb = new StringBuilder();
      while (!stack.isEmpty()) {
        sb.append(stack.pop());
      }

      return sb.toString();
    }
  }

}
