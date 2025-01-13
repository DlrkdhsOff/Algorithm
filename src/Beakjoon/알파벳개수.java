package Beakjoon;

import java.io.*;

public class 알파벳개수 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[] arr = br.readLine().toCharArray();

    int[] result = new int[26];

    for (char c : arr) {
      result[c - 97]++;
    }

    for (int i : result) {
      bw.write(i + " ");
    }
    bw.write("\n");
    bw.flush();
  }

}
