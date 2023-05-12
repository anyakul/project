package task055_LinkedList;

public class program {

  public static void main(String[] args) {
    LinkList list = new LinkList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.print();
    list.revert();
    System.out.println("Разворот");
    list.print();
  }
}
