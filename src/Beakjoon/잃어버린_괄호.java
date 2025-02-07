package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 잃어버린_괄호 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine();
    String[] nums = input.split("-");

    int sum = func(nums[0]);

    for (int i = 1; i < nums.length; i++) {
      sum -= func(nums[i]);
    }

    bw.write(sum + "\n");
    bw.flush();
  }

  public static int func(String num) {
    String[] str = num.split("\\+");
    int sum = 0;
    for (String s : str) {
      sum += Integer.parseInt(s);
    }

    return sum;
  }

}
