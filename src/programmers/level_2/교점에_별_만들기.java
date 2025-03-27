package programmers.level_2;

import java.util.HashSet;

public class 교점에_별_만들기 {

  public static void main(String[] args) {

    int[][] lines = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};

//    int[][] lines = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};

//    int[][] lines = {{1, -1, 0}, {2, -1, 0}};

//    int[][] lines = {{1, -1, 0}, {2, -1, 0}, {4, -1, 0}};

    String[] result = solution(lines);

    for (String line : result) {
      System.out.println(line);
    }
  }


  public static String[] solution(int[][] line) {

    HashSet<String> intersection = new HashSet<>();

    long maxX = Long.MIN_VALUE, maxY = Long.MIN_VALUE;
    long minX = Long.MAX_VALUE, minY = Long.MAX_VALUE;

    for (int i = 0; i < line.length; i++) {
      for (int j = i + 1; j < line.length; j++) {
        int[] lineA = line[i];
        int[] lineB = line[j];

        long denom = (long)lineA[0] * lineB[1] - (long)lineA[1] * lineB[0];

        if (0 != denom) {
          long x = (long)lineA[1] * lineB[2] - (long)lineA[2] * lineB[1];
          long y = (long)lineA[2] * lineB[0] - (long)lineA[0] * lineB[2];

          if (0 == x % denom && 0 == y % denom) {
            long intersectionX = x / denom;
            long intersectionY = y / denom;

            intersection.add(intersectionX + "," + intersectionY);

            maxX = Math.max(maxX, intersectionX);
            maxY = Math.max(maxY, intersectionY);
            minX = Math.min(minX, intersectionX);
            minY = Math.min(minY, intersectionY);
          }
        }
      }
    }

    boolean[][] starMap = new boolean[(int)(maxY - minY + 1)][(int)(maxX - minX + 1)];

    for (String point : intersection) {
      int index = point.indexOf(",");

      // Long.parseLong(String s, int beginIndex, int endIndex, int radix)
      // s : 파싱할 문자열
      // beginIndex : 파싱을 시작할 문자열의 시작 인덱스
      // endIndex : 파싱을 끝낼 문자열의 끝 인덱스
      // radix : 변환할 때 사용할 진수
      long pointX = Long.parseLong(point, 0, index, 10);
      long pointY = Long.parseLong(point, index + 1, point.length(), 10);

      starMap[(int)(maxY - pointY)][(int)(pointX - minX)] = true;
    }

    String[] result = new String[(int)(maxY - minY + 1)];


    for (int i = 0; i < maxY - minY + 1; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < maxX - minX + 1; j++) {
        sb.append(starMap[i][j] ? '*' : '.');
      }

      result[i] = sb.toString();
    }

    return result;
  }
}