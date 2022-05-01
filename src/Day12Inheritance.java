import java.util.Scanner;

public class Day12Inheritance {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-inheritance/problem
*/

    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    class Student extends Person{
        public int[] testScores;

        //Construtor
        Student( String firstName,  String lastName, int id,int []testScores ){
            super(firstName,lastName,id);
            this.testScores = testScores;
        }

        int media=0;
        int soma=0;
        char concept;

        public char calculate(){

            for(int i=0;i<testScores.length;i++){
                soma+=testScores[i];
            }

            media = soma/(testScores.length);

            if (media>=90 && media<=100){
                return 'O';

            }else if(media>=80 && media<90){
                return 'E';

            }else if(media>=70 && media<80){
                return 'A';

            }else if(media>=55 && media<70){
                return 'P';

            }else if(media>=40 && media<55){
                return 'D';

            }else{
                return 'T';
            }

        }
    }

    class Solution {
        public void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
            int id = scan.nextInt();
            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for(int i = 0; i < numScores; i++){
                testScores[i] = scan.nextInt();
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate() );
        }
    }
}
