package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 회사에_있는_사람 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<String, String> map = new HashMap<>();
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      String[] s = br.readLine().split(" ");
      if (map.containsKey(s[0]) && s[1].equals("leave")) {
        map.remove(s[0]);
      }
      map.put(s[0], s[1]);
    }

    List<String> list = new ArrayList<>();
    for (Map.Entry entry : map.entrySet()) {
      if (entry.getValue().equals("enter")) {
        list.add((String) entry.getKey());
      }
    }

    list.sort(Collections.reverseOrder());
    for (String s : list) {
      bw.write(s + "\n");
    }
    bw.flush();
  }

}
