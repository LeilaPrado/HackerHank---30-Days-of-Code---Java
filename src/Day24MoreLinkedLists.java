import java.util.LinkedList;
import java.util.Scanner;

public class Day24MoreLinkedLists {

    /*
    Link do Desafio:https://www.hackerrank.com/challenges/30-linked-list-deletion/problem?isFullScreen=true
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

        public static Node removeDuplicates(Node head) {

            LinkedList<Integer> auxiliar = new LinkedList<>();

            if (head == null) {
                return head;
            }

            auxiliar.addFirst(head.data);
            Node semDuplicadas = head;

            while (semDuplicadas.next != null) {

                if (auxiliar.contains(semDuplicadas.next.data)) {
                    semDuplicadas.next = semDuplicadas.next.next;
                } else {
                    auxiliar.addLast(semDuplicadas.next.data);
                    semDuplicadas = semDuplicadas.next;
                }

            }


            return head;
        }


        public Node insert(Node head, int data) {
            Node p = new Node(data);
            if (head == null)
                head = p;
            else if (head.next == null)
                head.next = p;
            else {
                Node start = head;
                while (start.next != null)
                    start = start.next;
                start.next = p;

            }
            return head;
        }

        public static void display(Node head) {
            Node start = head;
            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        public void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Node head = null;
            int T = sc.nextInt();
            while (T-- > 0) {
                int ele = sc.nextInt();
                head = insert(head, ele);
            }
            head = removeDuplicates(head);
            display(head);

        }
    }

}
