import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16ExceptionsStringToInteger {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
*/


    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String S = bufferedReader.readLine();
            bufferedReader.close();

            try{
                int value = Integer.parseInt(S);
                System.out.println(value);
            }
            catch(Exception e){
                System.out.println("Bad String");
            }
        }
    }
}
