import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day10BinaryNumbers {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true
    */


    public class Solution {


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());
            List<Integer> numeroBase10 = new ArrayList<Integer>();
            int valor = 0;
            int contador=0;

            bufferedReader.close();

            while (n > 0) {
                int resto = n % 2;
                n = n / 2;

                numeroBase10.add(resto);

            }
            int tamanho = numeroBase10.size() - 1;


            for (int i = tamanho; i >= 0;) {

                if (i == tamanho && numeroBase10.get(tamanho) == 0) {
                    i -= 1;
                }

                else if (numeroBase10.get(i) == 1) {
                    valor += 1;
                    i -= 1;

                    if (valor>=contador) {
                        contador = valor;
                    }


                } else {
                    if (valor >= contador) {
                        contador = valor;
                        valor = 0;
                        i-=1;

                    }

                    else {
                        break;
                    }

                }

            }

            System.out.println(contador);

        }

    }
}
