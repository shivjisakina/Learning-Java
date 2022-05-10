class Node {
  int val;
  Node next;

  Node(){}
  
  Node(int data) {
    this.val = data;
    this.next = null;
  }

  Node(int data, Node next) {
    this.val = data;
    this.next = next;
  }
}

public class Main {

  public static boolean searchLL(int val, Node head ) {
    Node temp = head;
    while (temp != null) {
      if (temp.val == val) {
        return true;
      } 
        
      temp = temp.next;
    }
    return false;
  }

  public static void tailInsert(Node head, int val) {
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = new Node(val);
    
  }

  public static void printLL(Node head) {
    while (head != null) {
      System.out.print(head.val + " -> ");
      head = head.next;
    }
    System.out.println("NULL");
  }

  public static Node headInsert(Node head, int newVal) {  
    return new Node(newVal, head);
  }

  public static void insertNegOneAtSecondPosition(Node head) {
    head.next = new Node(-1, head.next);
  }

  // 10 -> 3 -> 4 -> 6 -> 9 -> null
  // 10 -> 3 -> -1 -> 4 -> 6 -> 9 -> -1 -> null

  // 8 % 2 = 4 R 0
  
  public static void insertNegOneAfterOdd(Node head) {
    Node temp = head;
    while (temp != null) {
      if (temp.val % 2 == 1) {
        temp.next = new Node(-1, temp.next);
      }
      temp = temp.next;
    }
  }

  public static void removeEvenNumbers(Node head) {
    // Node temp = head;
    // while (temp != null) {
    //   if (temp.val % 2 == 0) {
    //     temp.next = temp.next.next;
    //   }
    //   temp = temp.next;
    // }

    Node odd = head;
    Node even = head;

    while (odd != null && even != null) {
      if (even.val % 2 == 0) {
        odd.next = even.next;
        odd = odd.next;
        if (odd != null) 
          even = odd.next; 
      } else {
        odd = odd.next;
        even = even.next;
      }
    }
    
  }

  
  public static void main(String[] args) {
    Node newNode = new Node(101);
    tailInsert(newNode, 3);
    tailInsert(newNode, 4);
    tailInsert(newNode, 6);
    tailInsert(newNode, 9);
    
    // 10 -> 3 -> 4 -> 6 -> 9 -> null
    
    System.out.println(newNode.val);
    System.out.println(newNode.next.val);
    System.out.println(newNode.next.next.val);
    boolean found = searchLL(10, newNode);
    System.out.println(found);
    printLL(newNode);
    removeEvenNumbers(newNode);
    printLL(newNode);
  }  
  
}
