package programmers.level_2;

import java.util.HashSet;

public class 교점에_별_만들기 {

  public static void main(String[] args) {

  }

  public String[] solution(int[][] line) {
    int lineCount = line.length;

    HashSet<String> intersectionPoints = new HashSet<>();

    long maxX = Long.MIN_VALUE, maxY = Long.MIN_VALUE;
    long minX = Long.MAX_VALUE, minY = Long.MAX_VALUE;

    for (int i = 0; i < lineCount; i++) {
      for (int j = i + 1; j < lineCount; j++) {
        int[] lineA = line[i];
        int[] lineB = line[j];

        long denominator = (long)lineA[0] * lineB[1] - (long)lineA[1] * lineB[0];

        if (0 != denominator) {
          long xNumerator = (long)lineA[1] * lineB[2] - (long)lineA[2] * lineB[1];
          long yNumerator = (long)lineA[2] * lineB[0] - (long)lineA[0] * lineB[2];

          if (0 == xNumerator % denominator && 0 == yNumerator % denominator) {
            long intersectionX = xNumerator / denominator;
            long intersectionY = yNumerator / denominator;

            intersectionPoints.add(intersectionX + "," + intersectionY);

            maxX = Math.max(maxX, intersectionX);
            maxY = Math.max(maxY, intersectionY);
            minX = Math.min(minX, intersectionX);
            minY = Math.min(minY, intersectionY);
          }
        }
      }
    }

    boolean[][] starMap = new boolean[(int)(maxY - minY + 1)][(int)(maxX - minX + 1)];

    for (String point : intersectionPoints) {
      int commaIndex = point.indexOf(",");

      long pointX = Long.parseLong(point, 0, commaIndex, 10);
      long pointY = Long.parseLong(point, commaIndex + 1, point.length(), 10);

      starMap[(int)(maxY - pointY)][(int)(pointX - minX)] = true;
    }

    String[] answer = new String[(int)(maxY - minY + 1)];

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < maxY - minY + 1; i++) {
      for (int j = 0; j < maxX - minX + 1; j++)
        stringBuilder.append(starMap[i][j] ? '*' : '.');

      answer[i] = stringBuilder.toString();
      stringBuilder.setLength(0);
    }

    return answer;
  }
}