package linkedlist.com;

import java.util.Scanner;

class Node
{
    int value;
    Node next;

    public Node(int value)
    {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList
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

    public static void main(String [] args)
    {
        LinkedList linkedList=new LinkedList();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int value=scanner.nextInt();
        for (int i=0;i<value;i++) {
            addNode(linkedList, scanner.nextInt());
        }

        viewList(linkedList);
    }

}
