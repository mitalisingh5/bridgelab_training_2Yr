import java.util.Stack;

public class DeleteConsecutive {
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,3,4};
        Stack<Integer> stack = new Stack<>();

        for(int num : arr){
            if(!stack.isEmpty() && stack.peek() == num)
                stack.pop();
            else
                stack.push(num);
        }

        System.out.println(stack);
    }
}