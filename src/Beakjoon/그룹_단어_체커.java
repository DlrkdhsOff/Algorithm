package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 그룹_단어_체커 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    int result = 0;
    for (int i = 0; i < N; i++) {
      String input = br.readLine();

      if (isVisited(input)) {
        result++;
      }

    }
    bw.write(result + "\n");
    bw.flush();
  }

  public static boolean isVisited(String word) {
    boolean[] visited = new boolean[26];
    char prev = word.charAt(0);

    visited[prev - 'a'] = true;
    for (int i = 1; i < word.length(); i++) {
      char ch = word.charAt(i);

      if (visited[ch - 'a'] && prev != ch) {
        return false;
      }

      visited[ch - 'a'] = true;
      prev = ch;
    }

    return true;
  }

}
