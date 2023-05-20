package Lec1;

public class Main {
    public static void main(String[] args) throws Exception{
        MyLinkedList ll = new MyLinkedList();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddLast(6);
        ll.AddLast(7);
        ll.AddLast(8);
        ll.createCycle(5);
        // ll.Display();
        if(ll.hasCycle(ll.GetNode(0)) != null){
            System.out.println("Yes Cycle hai");
        }
        System.out.println(ll.floyydCycleRemoval().val);
        ll.Display();
    }
}
