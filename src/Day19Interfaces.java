public class Day19Interfaces {
    /*
    Link do Desafio:https://www.hackerrank.com/challenges/30-interfaces/problem?isFullScreen=true
*/

    interface AdvancedArithmetic{
        int divisorSum(int n);
    }
    class Calculator implements AdvancedArithmetic {
        int soma =0;

        public int divisorSum(int n) {
            for (int i=1; i<=n; i++){
                if (n%i == 0){
                    soma+=i;
                }
            }
            return soma;
        }
    }
}
