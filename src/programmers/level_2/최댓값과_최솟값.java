package programmers.level_2;

import java.util.*;

public class 최댓값과_최솟값 {

  public static void main(String[] args) {
    System.out.println(solution("1 2 3 4"));
  }

  public static  String solution(String s) {
    int[] arr = Arrays.stream(s.split(" "))
        .mapToInt(Integer::parseInt).toArray();

    Arrays.sort(arr);

    return arr[0] + " " + arr[arr.length-1];
  }

}
