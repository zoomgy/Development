package Lec1;
public class MyLinkedList {
    public class Node {
        int val;
        Node next;
    }

    private Node head;
    private int size;
    private Node tail;

    // Add First

    public void AddFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            nn.next = head;
            head = nn;
            this.size++;
        }
    }

    // Add Last

    public void AddLast(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            tail.next = nn;
            tail = nn;
            this.size++;
        }
    }

    // Display

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    // Display value from index K

    public Node GetNode(int k) throws Exception {
        Node temp = head;
        if (k < 0 || k >= size) {
            throw new Exception("Bhen ke Lund chutiya hai kya Randike.");
        }
        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Add index at any Location

    public void AddAtAnIndex(int item, int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Bhen ke Lund chutiya hai kya Randike.");
        }
        if (k == 0) {
            AddFirst(item);
        } else if (k == size) {
            AddLast(item);
        } else {
            Node BeechKa = new Node();
            BeechKa.val = item;
            Node k_1th = GetNode(k - 1);
            Node kth = k_1th.next;
            k_1th.next = BeechKa;
            BeechKa.next = kth;
            size++;
        }
    }

    // Get First Ka Data
    public int getFirst() {
        return head.val;
    }

    // Get Last Ka Data
    public int getLast() {
        return tail.val;
    }

    public int getValAtIndex(int k) throws Exception {
        return GetNode(k).val;
    }

    // Remove first value

    public int removeFirst() throws Exception {
        if (size == 0) {
            throw new Exception("Size 0 hai bhosadike");
        }
        int rv = head.val;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            Node temp1 = head;
            head = head.next;
            temp1.next = null;
            size--;
        }
        return rv;

    }

    // Remove Last

    public int removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("Size 0 hai bhosadike");
        }
        int rv = tail.val;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            Node n = GetNode(size - 2);
            tail = n;
            tail.next = null;
            size--;
        }
        return rv;
    }

    // Remove at index

    public int removeAtIndex(int k) throws Exception{
        if(k<0 || k>size){
            throw new Exception("Bhosadike range ke baahr remove kr rha hai gandu.");
        }
        else if(k == 0){
            return removeFirst();
        }
        else if(k == size-1){
            return removeLast();
        }
        else{
            Node k_1th = GetNode(k-1);
            Node kth = GetNode(k);
            k_1th.next = kth.next;
            kth.next = null;
            size --;
            return kth.val;
        }
    }
}