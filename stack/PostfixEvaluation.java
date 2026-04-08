import java.util.Stack;

public class PostfixEvaluation {

    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }
            
            else {
                int n2 = stack.pop();
                int n1 = stack.pop();

                switch (ch) {
                    case '+': stack.push(n1 + n2); break;
                    case '-': stack.push(n1 - n2); break;
                    case '*': stack.push(n1 * n2); break;
                    case '/': stack.push(n1 / n2); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "234*+5+";
        System.out.println("Result = " + evaluatePostfix(exp));
    }
}