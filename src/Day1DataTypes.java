import java.util.Scanner;

public class Day1DataTypes {

    /*
    Link do desafio: https://www.hackerrank.com/challenges/30-data-types/problem?isFullScreen=true
*/

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */

        int var1 = 0;
        double var2 = 0.0;
        String var3 = "";

        /* Read and save an integer, double, and String to your variables.*/

        var1 = Integer.parseInt(scan.nextLine());

        var2 = Double.parseDouble(scan.nextLine());

        var3 = scan.nextLine();


        /* Print the sum of both integer variables on a new line. */

        System.out.println(var1 + i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(var2 + d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + var3);
    }

}
