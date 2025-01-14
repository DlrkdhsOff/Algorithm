package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Stack;

public class 에디터 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String text = br.readLine();

    Stack<String> stack = new Stack<>();
    Stack<String> sub = new Stack<>();

    stack.addAll(List.of(text.split("")));

    int M = Integer.parseInt(br.readLine());

    for (int i = 0; i < M; i++) {
      String[] input = br.readLine().split(" ");

      switch (input[0]) {
        case "L" :
          if (!stack.isEmpty()) {
            sub.push(stack.pop());
          }
          break;
        case "D":
          if (!sub.isEmpty()) {
            stack.push(sub.pop());
          }
          break;
        case "B":
          if (!stack.isEmpty()) {
            stack.pop();
          }
          break;
        case "P":
          stack.push(input[1]);
          break;
      }
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sub.push(stack.pop());
    }

    while (!sub.isEmpty()) {
      sb.append(sub.pop());
    }
    bw.write(sb.toString() + "\n");
    bw.flush();
  }

}
