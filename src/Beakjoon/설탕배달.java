package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 설탕배달 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int count = 0;

    while (N >= 0) {
      if (N % 5 == 0) {
        count += N / 5;
        bw.write(count + "\n");
        bw.flush();
        return;
      }
      N -= 3;
      count++;
    }

    bw.write("-1\n");
    bw.flush();
  }

}
