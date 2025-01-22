package programmers.level_0;

public class 점_위치_구하기 {
  public static void main(String[] args) {

    System.out.println(solution(new int[] {1,-2}));
  }

  public static int solution(int[] dot) {
    if(dot[0] > 0) {
      if(dot[1] > 0) {
        return 1;
      }
      return 4;
    }else {
      if(dot[1] > 0) {
        return 2;
      }
      return 3;
    }
  }

}
