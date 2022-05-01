import java.util.Scanner;

public class Day25RunningTimeAndComplexity {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
*/

    public class Solution {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int n = entrada.nextInt();

            for (int i = 0; i < n; i++) {
                int number = entrada.nextInt();
                System.out.println(isPrime(number) ? "Prime" : "Not prime");
            }
            entrada.close();

        }
        private static boolean isPrime(int num) {
            if (num <2) {
                return false;
            }


            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0) {
                    return false;
                }

            }

            return true;
        }


    }
}
