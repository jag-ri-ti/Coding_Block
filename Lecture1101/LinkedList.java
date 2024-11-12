package Lecture1101;

public class LinkedList {
    class Node {
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item) {

    }

    public void addLast(int item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public Node getNode(int k) {
        Node temp = head;
        for (int i = 0; i < k; i++)
            temp = temp.next;
        return temp;
    }

    public void addAtIndex(int item, int k) {
        if (k == 0)
            addFirst(item);
        else if (k == size)
            addLast(item);
        else {
            Node nn = new Node();
            nn.val = item;
            Node k_1thNode = getNode(k - 1);
            nn.next = k_1thNode.next;
            k_1thNode.next = nn;
            size++;
        }
    }

    public int getFirst() {
        return head.val;
    }

    public int getLast() {
        return tail.val;
    }

    public int getIndex(int k) {
        if (k == 0)
            return getFirst();
        else if (k == size - 1)
            return getLast();
        else
            return getNode(k).val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val++);
        }
    }

    public int removeFirst() {
        int rv = head.val;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;

        }
        size--;
        return rv;
    }

    public int removeLast() {
        if (size == 1) {
            return removeFirst();
        } else {
            int rv = tail.val;
            tail = getNode(size - 1);
            tail.next = null;
            size--;
            return rv;
        }
    }

    public int removeMiddle(int k) {
        if (k == 0)
            return removeFirst();
        else if (k == size - 1)
            return removeLast();
        else{
            Node 
        } 
            
    }

}
