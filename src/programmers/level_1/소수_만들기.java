package programmers.level_1;

public class 소수_만들기 {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};

    System.out.println(solution(nums));
  }

  public static int solution(int[] nums) {
    int answer = 0;

    for(int i = 0; i < nums.length - 2; i++) {
      for(int j = i + 1; j < nums.length - 1; j++) {
        for(int k = j + 1; k < nums.length; k++) {
          answer += func(nums[i] + nums[j] + nums[k]);
        }
      }
    }

    return answer;
  }

  public static int func(int n) {
    if (n <= 1 || n % 2 == 0) return 0;

    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) return 0;
    }

    return 1;
  }

}
