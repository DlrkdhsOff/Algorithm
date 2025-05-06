package programmers.level_1;

import java.util.*;

public class 두_개_뽑아서_더하기 {
  public static void main(String[] args) {
    int[] numbers = {2, 1, 3, 4, 1};

    System.out.println(Arrays.toString(solution(numbers)));
  }

  public static int[] solution(int[] numbers) {
    Set<Integer> set = new HashSet<>();

    for(int i = 0; i < numbers.length; i++) {
      for(int j = i + 1; j < numbers.length; j++) {
        set.add(numbers[i] + numbers[j]);
      }
    }

    int[] result = set.stream().mapToInt(i -> i).toArray();
    Arrays.sort(result);

    return result;

  }

}
