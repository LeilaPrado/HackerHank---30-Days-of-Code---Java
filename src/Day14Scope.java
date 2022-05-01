import java.util.Scanner;

public class Day14Scope {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-abstract-classes/problem
*/


    class Difference {
        private int[] elements;
        public int maximumDifference;
        public int difference=0;

        Difference(int[] elements){
            this.elements = elements;
        }

        public int computeDifference(){

            for (int i=0; i<elements.length;i++){

                for (int j=i+1;j<elements.length;j++){
                    difference = Math.abs(elements[i]-elements[j]);

                    if (difference>=this.maximumDifference){
                        this.maximumDifference = difference;
                        difference=0;

                    }else{
                        difference=0;
                    }

                }

            }

            return this.maximumDifference;
        }

    } // End of Difference class

    public class Solution {

        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }

}
