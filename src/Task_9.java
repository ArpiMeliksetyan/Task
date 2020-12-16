import java.util.Scanner;
import java.util.Stack;

public class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        System.out.println(isBalancedBrackets(x));


    }
    static boolean isBalancedBrackets(String x){

        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        boolean isBalanced = true;


        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '('
                    || x.charAt(i) == ')'
                    || x.charAt(i) == '['
                    || x.charAt(i) == ']'
                    || x.charAt(i) == '{'
                    || x.charAt(i) == '}') {
                stack.push(x.charAt(i));
            }
        }

        for (Character character : stack) {

            if (character == '(' || character == '[' || character == '{') {
                stack1.push(character);
            }
            if (stack1.isEmpty()) {
                isBalanced = false;
                break;
            } else if (character == ')' && stack1.peek() == '(') {
                stack1.pop();
            } else if (character == ']' && stack1.peek() == '[') {
                stack1.pop();
            } else if (character == '{' && stack1.peek() == '{') {
                stack1.pop();
            }

        }
        if (!(stack1.isEmpty())) {
            isBalanced = false;
        }

        return isBalanced;

    }
}
