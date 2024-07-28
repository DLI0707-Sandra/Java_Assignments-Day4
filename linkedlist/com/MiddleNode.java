package linkedlist.com;

import java.util.Scanner;

public class MiddleNode
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

    public static int middleElement(LinkedList list)
    {
        Node slow_pointer=list.head;
        Node fast_pointer=list.head;

        while (fast_pointer!=null&&fast_pointer.next!=null)
        {
            fast_pointer=fast_pointer.next.next;
            slow_pointer=slow_pointer.next;
        }

        return slow_pointer.value;
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

        int middle=middleElement(linkedList);
        System.out.println("Middle element :"+middle);

    }
}
