package programmers.level_1;

public class 콜라츠_추측 {

  public static void main(String[] args) {
    System.out.println(solution(23421));
  }

  public static int solution(long num) {

    if(num == 1) return 0;

    int count = 0;

    while(count <= 500) {
      if(num == 1) {
        break;
      }

      if(num % 2 == 0) num /= 2;
      else num = num * 3 + 1;

      count++;
    }

    return count <= 500 ? count : -1;
  }

}
