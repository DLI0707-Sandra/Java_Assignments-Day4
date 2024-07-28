package linkedlist.com;


import java.util.Scanner;

public class ReverseLinkedList
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

    public static void viewList(LinkedList list)
    {
        Node currentNode = list.head;
        while (currentNode != null)
        {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    public static Node reverseList(LinkedList list)
    {
        Node previous=null;
        Node current=list.head;
        Node next=null;

        while (current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
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
        linkedList.head=reverseList(linkedList);
        viewList(linkedList);
    }
}
