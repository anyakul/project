package task055_LinkedList;

public class LinkList {
  Node head;
  Node tail;

  public void add(int value) {
    Node node = new Node();
    node.value = value;

    if (head == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      node.previous = tail;
      tail = node;
    }
  }

  public void revert() {
    if (head != null && head.next != null) {
      Node temp = head;
      revert(head.next, head);
      temp.next = null;
    }
  }

  private void revert(Node currentNode, Node previousNode) {
    if (currentNode.next == null) {
      head = currentNode;
    } else {
      revert(currentNode.next, currentNode);
    }

    currentNode.next = previousNode;
  }

  public void print() {
    Node node = head;
    while (node != null) {
      System.out.println(node.value);
      node = node.next;
    }
  }

  public class Node {
    int value;
    Node next;
    Node previous;
  }
}
