package linkedlist.com;

import java.util.Scanner;

public class Cycle
{
    Node head;

    public static void addNode(LinkedList list, int value)
    {
        Node newNode = new Node(value);
        if (list.head == null)
        {
            list.head = newNode;
        }
        else
        {
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }

            last.next = newNode;
        }
    }



    public static boolean cycle(LinkedList list)
    {
        Node slow_pointer=list.head;
        Node fast_pointer=list.head;

        while (slow_pointer!=null&&fast_pointer!=null&&fast_pointer.next!=null)
        {
            fast_pointer=fast_pointer.next.next;
            slow_pointer=slow_pointer.next;

            if (slow_pointer==fast_pointer)
                return true;
        }
        return false;
    }

    public static void main(String [] args)
    {
        LinkedList linkedList=new LinkedList();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int value=scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i=0;i<value;i++) {
            addNode(linkedList, scanner.nextInt());
        }
        boolean present=cycle(linkedList);
        if(present)
            System.out.println("Cycle present!");
        else
            System.out.println("Cycle not present!");
    }
}
