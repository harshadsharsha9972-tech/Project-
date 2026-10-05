/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class MyLinkedList  {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head; // first node, null = empty list
    int size;

    void insertFirst(int x) {
        Node n = new Node(x);
        n.next = head; // new node points to old head
        head = n;      // head moves to new node
        size++;
    }

    void insertLast(int x) {
        Node n = new Node(x);
        if (head == null) { head = n; size++; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next; // walk to last node
        cur.next = n; // link last -> new node
        size++;
    }

    void printList() {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.data + " -> ");
        }
        System.out.println("null");
    }
    void insertAt(int index, int x) {
    if (index == 0) { 
        insertFirst(x); 
        return; 
    }
    Node n = new Node(x);
    Node cur = head;
    for (int i = 0; i < index - 1; i++) {
        if (cur == null) throw new IndexOutOfBoundsException();
        cur = cur.next;
    }
    n.next = cur.next;
    cur.next = n;
    size++;
}

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(30);
        list.printList(); // 10 -> 20 -> 30 -> null
        System.out.println("Size: " + list.size);
    }


}