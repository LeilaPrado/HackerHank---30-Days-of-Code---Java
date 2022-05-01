public class Day4ClassVsInstance {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-class-vs-instance/problem?isFullScreen=true
*/

    public class Person {
        private int age;

        public Person(int initialAge) {
            if (initialAge <= 0) {
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                this.age = initialAge;
            }

        }

        public void amIOld() {

            if (this.age < 13) {
                System.out.println("You are young.");

            } else if (this.age >= 13 && this.age < 18) {
                System.out.println("You are a teenager.");

            } else {
                System.out.println("You are old.");
            }
        }

        public void yearPasses() {
            this.age += 1;
        }


    }
}
