package programmers.level_1;

public class 음양_더하기 {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
  }

  public static int solution(int[] absolutes, boolean[] signs) {
    int result = 0;

    for(int i = 0; i < absolutes.length; i++) {
      if(signs[i]) result += absolutes[i];
      else result -= absolutes[i];
    }

    return result;
  }

}
