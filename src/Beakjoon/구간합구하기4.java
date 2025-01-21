package Beakjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 구간합구하기4 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] num = new int[N + 1];
    int[] prefix = new int[N + 1];

    st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= N; i++) {
      num[i] = Integer.parseInt(st.nextToken());
      prefix[i] = prefix[i - 1] + num[i];
    }

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int index1 = Integer.parseInt(st.nextToken());
      int index2 = Integer.parseInt(st.nextToken());

      int result = prefix[index2] - prefix[index1 - 1];
      bw.write(result + "\n");
    }

    bw.flush();
  }

}
