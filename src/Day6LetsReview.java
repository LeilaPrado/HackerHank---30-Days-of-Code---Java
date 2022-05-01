import java.util.Scanner;

public class Day6LetsReview {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-loops/problem?isFullScreen=true
    */


    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scanner = new Scanner(System.in);

            int T =scanner.nextInt();

            for (int i=0;i<T;i++ ){
                String S = scanner.next();
                String par = "";
                String impar= "";

                char[] vetorS = S.toCharArray();

                for(int j = 0; j < vetorS.length; j++){
                    if (j%2 == 0){
                        par+= vetorS[j];

                    } else{
                        impar+= vetorS[j];
                    }

                }

                System.out.println(par+" "+impar);

            }

            scanner.close();

        }

    }

}
