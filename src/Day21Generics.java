import java.util.Scanner;

public class Day21Generics {

    /*
    Link do Desafio:https://www.hackerrank.com/challenges/30-generics/problem?isFullScreen=true
*/

    class Printer <T> {

        public <T> void printArray (T[] array ){

            for (T element : array) {
                System.out.println(element);
            }

        }

    }

    public class Generics {

        public void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            Integer[] intArray = new Integer[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = scanner.nextInt();
            }

            n = scanner.nextInt();
            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = scanner.next();
            }

            Printer<Integer> intPrinter = new Printer<Integer>();
            Printer<String> stringPrinter = new Printer<String>();
            intPrinter.printArray( intArray  );
            stringPrinter.printArray( stringArray );
            if(Printer.class.getDeclaredMethods().length > 1){
                System.out.println("The Printer class should only have 1 method named printArray.");
            }
        }
    }
}
