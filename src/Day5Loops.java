import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day5Loops {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-loops/problem?isFullScreen=true
    */

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            for (int i=1;i<=10;i++){
                int valor = n*i;
                System.out.println(n +" x "+i+" = "+valor);
            }

            bufferedReader.close();
        }
    }
}
