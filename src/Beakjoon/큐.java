package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class 큐 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    Deque<String> queue = new LinkedList<>();

    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");

      switch (input[0]) {
        case "push" :
          queue.offer(input[1]);
          break;
        case "pop":
          if (queue.isEmpty()) {
            bw.write("-1\n");
          } else {
            bw.write(queue.poll()+"\n");
          }
          break;
        case "size" :
          bw.write(queue.size()+"\n");
          break;
        case "empty":
          if (queue.isEmpty()) {
            bw.write("1\n");
          } else {
            bw.write("0\n");
          }
          break;
        case "front":
          if (queue.isEmpty()) {
            bw.write("-1\n");
          } else {
            bw.write(queue.getFirst()+"\n");
          }
          break;
        case "back":
          if (queue.isEmpty()) {
            bw.write("-1\n");
          } else {
            bw.write(queue.getLast()+"\n");
          }
          break;
      }
    }
    bw.flush();
  }

}
//push X: 정수 X를 큐에 넣는 연산이다.
//    pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//    empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.