package task057_BinaryTree;

public class Tree<T extends Comparable<T>> {
  private Node root;

  public boolean contains(T value) {
    Node node = root;

    while (node != null) {
      if (node.value.equals(value)) {
        return true;
      }

      if (node.value.compareTo(value) > 0) {
        node = node.left;
      } else {
        node = node.right;
      }
      addNode(node, value);
    }

    return false;
  }

  public void add(T value) {
    Node node = root;
    Node newNode = new Node();
    newNode.value = value;

    if (root != null) {
      if (node.value.compareTo(value) > 0) {
        node.left = newNode;
      } else {
        node.right = newNode;
      }
    } else {
      root = newNode;
    }

    System.out.println(node.toString());
  }

  public boolean addNode(Node node, T value) {
    if (node.value == value) {
      return false;
    } else {
      if (node.value.compareTo(value) > 0) {
        if (node.left != null) {
          boolean result = addNode(node.left, value);
          node.left = rebalance(node.left);
          return result;
        } else {
          node.left = new Node();
          node.left.color = Color.RED;
          node.left.value = value;
          return true;
        }
      } else {
        if (node.right != null) {
          if (node.right != null) {
            boolean result = addNode(node.right, value);
            node.right = rebalance(node.right);
            return result;
          } else {
            node.right = new Node();
            node.right.color = Color.RED;
            node.right.value = value;
            return true;
          }
        }
      }
    }

    return true;
  }

  public Node rebalance(Node node) {
    Node result = node;
    boolean needRebalance;
    do {
      needRebalance = false;
      if (result.right != null && result.right.color == Color.RED
          && (result.left == null || result.left.color == Color.BLACK)) {
        needRebalance = true;
        result = rightSwap(result);
      }
      if (result.left != null && result.left.color == Color.RED && result.left.left != null
          && result.left.left.color == Color.RED) {
        needRebalance = true;
        result = leftSwap(result);
      }
      if (result.left != null && result.left.color == Color.RED && result.right != null
          && result.right.color == Color.RED) {
        needRebalance = true;
        colorSwap(result);
      }
    } while (needRebalance);

    return result;
  }

  public Node rightSwap(Node node) {
    Node right = node.right;
    Node between = right.left;
    right.left = node;
    node.right = between;
    right.color = node.color;
    node.color = Color.RED;

    return right;
  }

  public Node leftSwap(Node node) {
    Node left = node.left;
    Node between = left.right;
    left.right = node;
    node.left = between;
    left.color = node.color;
    node.color = Color.RED;

    return left;
  }

  private void colorSwap(Node node) {
    node.right.color = Color.BLACK;
    node.left.color = Color.BLACK;
    node.color = Color.RED;
  }

  public class Node {
    private T value;
    private Color color;
    private Node left;
    private Node right;

    public String toString() {
      return "Node(" + "value" + value + ", color" + color + ")";
    }
  }

  private enum Color {
    RED, BLACK
  }
}
