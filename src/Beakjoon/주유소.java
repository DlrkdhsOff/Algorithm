package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 주유소 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    long[] distance = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();

    long[] price = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();

    long result = 0;
    long min = price[0];

    for (int i = 0; i < N - 1; i++) {
      if(min > price[i]) {
        min = price[i];
      }

      result += (min * distance[i]);
    }

    bw.write(result + "\n");
    bw.flush();
  }

}
