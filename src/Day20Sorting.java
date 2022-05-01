import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day20Sorting {

    /*
    Link do Desafio:https://www.hackerrank.com/challenges/30-sorting/problem
    */

    public class Solution {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int totalOfSwaps=0;
            int numberOfSwaps = 0;

            for (int i = 0; i < n; i++) {
                totalOfSwaps+=numberOfSwaps;
                numberOfSwaps = 0;

                for (int j = 0; j < n-1 ; j++) {
                    if (a.get(j) > a.get(j+1)) {

                        int tmp = a.get(j);
                        a.set(j, a.get(j+1));
                        a.set(j+1, tmp);

                        numberOfSwaps+=1;
                    }

                }

                if (numberOfSwaps == 0) {
                    break;
                }

            }

            System.out.println("Array is sorted in "
                    +totalOfSwaps+ " swaps.");
            System.out.println("First Element: "+a.get(0));                        System.out.println("Last Element: "+a.get(n-1));

            bufferedReader.close();

        }

    }
}
