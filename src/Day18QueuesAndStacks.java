import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18QueuesAndStacks {

    /*
    Link do Desafio: https://www.hackerrank.com/challenges/30-queues-stacks/problem?isFullScreen=true
*/

    public class Solution {

        Stack<Character> objPilha = new Stack<Character>();
        Queue<Character> queue = new LinkedList<>();

        void pushCharacter(char ch) {
            objPilha.push(ch);

        }

        char popCharacter() {
            return objPilha.pop();

        }

        void enqueueCharacter(char ch) {
            queue.add(ch);
        }


        char dequeueCharacter() {
            return queue.remove();
        }

    }

}
