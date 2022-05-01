import java.util.LinkedList;
import java.util.Scanner;

public class Day15LinkedList {

    /*
    Link do Desafio:https://www.hackerrank.com/challenges/30-linked-list/problem
*/


    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    class Solution {



        public Node insert(Node head, int data) {

            LinkedList<Node> integerList = new LinkedList<Node>();
            Node intermediaryNode = new Node(data);
            integerList.add(intermediaryNode);
            display(head);

            return intermediaryNode;

        }

        public static void display(Node head) {
            Node start = head;
            while(start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        public void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Node head = null;
            int N = sc.nextInt();

            while(N-- > 0) {
                int ele = sc.nextInt();
                head = insert(head,ele);
            }
            display(head);
            sc.close();
        }
    }
}
