import java.util.Date;
import java.util.Scanner;

public class Day26NestedLogic {

    /*
    Link do Desafio:https://www.hackerrank.com/challenges/30-nested-logic/problem
*/

    public class Solution {

        public static void main(String[] args) {
            int fee;

            Scanner input = new Scanner(System.in);

            int returnedDay = input.nextInt();
            int returnedMonth = input.nextInt();
            int returnedYear = input.nextInt();
            int dueDay = input.nextInt();
            int dueMonth = input.nextInt();
            int dueYear = input.nextInt();

            input.close();

            Date returnedDate = new Date(returnedYear, returnedMonth,returnedDay);
            Date dueDate = new Date(dueYear,dueMonth,dueDay );

            if (returnedDate.compareTo(dueDate) <=0 ) {
                fee=0;

            }else if (returnedYear > dueYear){
                fee = 10000;

            } else if (returnedYear == dueYear && returnedMonth> dueMonth){
                fee= (returnedMonth - dueMonth) * 500;

            } else if (returnedYear == dueYear && returnedMonth == dueMonth && returnedDay> dueDay){
                fee = (returnedDay - dueDay) * 15;

            }else{
                fee = 0;
            }

            System.out.println(fee);
        }

    }
}
