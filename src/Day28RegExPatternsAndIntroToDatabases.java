import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day28RegExPatternsAndIntroToDatabases {

    /*
    Link do Desafio:https://www.hackerrank.com/challenges/30-regex-patterns/problem
*/

    public class Solution {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            int n = entrada.nextInt();
            entrada.nextLine();

            ArrayList<String> results = new ArrayList<String>();

            for (int i = 0; i < n; i++) {
                String line = entrada.nextLine();
                String[] tokens = line.split(" ");
                if (tokens[1].endsWith("@gmail.com"))
                    results.add(tokens[0]);
            }

            Collections.sort(results);
            for (String s : results) {
                System.out.println(s);
            }
        }
    }
}
