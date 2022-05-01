import java.util.LinkedList;
import java.util.Scanner;

public class Day23BSTLevelOrderTraversal {

    /*
    Link do Desafio:
    */

    class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    class Solution{

        static void levelOrder(Node root){

            LinkedList<Node> filaRamificada = new LinkedList();
            filaRamificada.add(root);

            while(filaRamificada.peek() != null) {
                Node exibir = filaRamificada.remove();
                System.out.print(exibir.data);

                if(exibir.left != null) {
                    filaRamificada.add(exibir.left);
                }
                if(exibir.right != null) {
                    filaRamificada.add(exibir.right);
                }
                if(filaRamificada.peek() != null) {
                    System.out.print(" ");
                }
            }

        }

        public Node insert(Node root,int data){
            if(root==null){
                return new Node(data);
            }
            else{
                Node cur;
                if(data<=root.data){
                    cur=insert(root.left,data);
                    root.left=cur;
                }
                else{
                    cur=insert(root.right,data);
                    root.right=cur;
                }
                return root;
            }
        }
        public void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }
    }
}
