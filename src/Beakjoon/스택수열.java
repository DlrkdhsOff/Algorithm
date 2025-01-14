package Beakjoon;

import java.io.*;
import java.util.Stack;

public class 스택수열 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int size = Integer.parseInt(br.readLine());
    int[] input = new int[size];

    StringBuilder sb = new StringBuilder();

    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < size; i++) {
      input[i] = Integer.parseInt(br.readLine());
    }

    int cur = 1;
    for (int i : input) {
      while (cur <= i) {
        stack.push(cur++);
        sb.append("+\n");
      }

      if (stack.peek() == i) {
        stack.pop();
        sb.append("-\n");
      } else {
        sb.setLength(0);
        sb.append("NO");
        break;
      }
    }


    bw.write(sb.toString());
    bw.write("\n");
    bw.flush();
  }

}
