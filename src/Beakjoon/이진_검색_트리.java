package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BinaryNode {
  int item;
  BinaryNode left;
  BinaryNode right;

  public BinaryNode(int item) {
    this.item = item;
    this.left = null;
    this.right = null;
  }
}

class BinarySearchTree {
  BinaryNode head;

  public void addNode(int item) {
    if (this.head == null) {
      this.head = new BinaryNode(item);
    } else {
      addNode(this.head, item);
    }
  }

  private void addNode(BinaryNode node, int item) {
    if (item < node.item) {
      if (node.left == null) {
        node.left = new BinaryNode(item);
      } else {
        addNode(node.left, item);
      }
    } else {
      if (node.right == null) {
        node.right = new BinaryNode(item);
      } else {
        addNode(node.right, item);
      }
    }
  }

  public void postOrder(BinaryNode node) {
    if (node != null) {
      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.item + " ");
    }
  }
}

public class 이진_검색_트리 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;

    BinarySearchTree bt = new BinarySearchTree();
    while ((line = br.readLine()) != null && !line.isEmpty()) {
      bt.addNode(Integer.parseInt(line));
    }

    bt.postOrder(bt.head);
  }
}
