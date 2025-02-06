package Beakjoon;

import java.io.*;

public class 전자레인지 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] time = {300, 60, 10};

    int cook = Integer.parseInt(br.readLine());

    int[] result = new int[3];
    for (int i = 0; i < time.length; i++) {
      result[i] = cook / time[i];
      cook %= time[i];
    }

    if (cook > 0) {
      bw.write("-1\n");
    } else {
      for (int r : result) {
        bw.write(r + " ");
      }
    }
    bw.flush();
  }
}
