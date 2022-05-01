import java.io.*;

public class Day9Recursion3 {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-recursion/problem?isFullScreen=true
*/

    class Result {

        /*
         * Complete the 'factorial' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER n as parameter.
         */

        public static int factorial(int n) {

            int valor = 0;

            if (n<=1){
                valor = 1;
            }else{
                valor = n*factorial(n-1);
            }
            return valor;

        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.factorial(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
