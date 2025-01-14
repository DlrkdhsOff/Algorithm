package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();
    sb.append("<");

    Queue<Integer> queue = new LinkedList<>();

    StringTokenizer token = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(token.nextToken());
    int K = Integer.parseInt(token.nextToken());

    for (int i = 1; i <= N; i++) {
      queue.offer(i);
    }

    while (queue.size() != 1) {
      for (int i = 0; i < K - 1; i++) {
        queue.offer(queue.poll());
      }
      sb.append(queue.poll() + ", ");
    }
    sb.append(queue.poll());
    sb.append(">");

    bw.write(sb.toString());
    bw.write("\n");
    bw.flush();
  }

}
