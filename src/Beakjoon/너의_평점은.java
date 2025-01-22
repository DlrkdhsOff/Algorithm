package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class 너의_평점은 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<String, Double> map = new HashMap<>();

    map.put("A+", 4.5);
    map.put("A0", 4.0);
    map.put("B+", 3.5);
    map.put("B0", 3.0);
    map.put("C+", 2.5);
    map.put("C0", 2.0);
    map.put("D+", 1.5);
    map.put("D0", 1.0);
    map.put("F", 0.0);

    double total = 0;
    double result = 0;
    for (int i = 0; i < 20; i++) {
      String[] input = br.readLine().split(" ");

      double score = Double.parseDouble(input[1]);

      if (!input[2].equals("P")) {
        total += score;
        result += (score * map.get(input[2]));
      }
    }

    bw.write(result / total + "\n");
    bw.flush();
  }
}