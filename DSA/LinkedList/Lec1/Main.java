package Lec1;

public class Main {
    public static void main(String[] args) throws Exception{
        MyLinkedList ll = new MyLinkedList();




        // ll.AddFirst(4);
        // ll.AddFirst(4);
        // ll.AddFirst(5);
        // ll.AddFirst(8);
        // ll.Display();
        // ll.AddLast(7);
        // ll.Display();
        // ll.AddFirst(0);
        // ll.Display();
        // System.out.println(ll.GetNode(2).val);
        // ll.AddAtAnIndex(100, 2);
        // ll.Display();
        // System.out.println(ll.getLast());
        // System.out.println(ll.getFirst());
        // System.out.println(ll.getValAtIndex(2));

        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.AddFirst(6);
        ll.AddFirst(7);
        ll.AddFirst(8);
        ll.Display();
        ll.removeFirst();
        ll.removeLast();
        ll.Display();


    }
}
