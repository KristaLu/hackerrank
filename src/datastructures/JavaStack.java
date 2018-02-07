package datastructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
    }

    private static boolean isBalanced(String input) {
        if (input.length()%2==1)
            return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
                if(ch == '(') stack.push(')');
                else if(ch == '{') stack.push('}');
                else if(ch == '[') stack.push(']');
                else {
                    if (stack.isEmpty() || ch!=stack.peek())
                        return false;
                    else stack.pop();
                }
        }
        if (stack.isEmpty())
            return true;

        return false;
    }
}
