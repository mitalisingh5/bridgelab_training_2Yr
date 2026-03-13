import java.util.Stack;

public class maximumstack {
    public static void main(String[] args) {

        int arr[] = {10, 25, 5, 40, 15};
        Stack<Integer> stack = new Stack<>();

        // Push elements into stack
        for(int num : arr){
            stack.push(num);
        }

        int max = stack.pop();

        while(!stack.isEmpty()){
            int value = stack.pop();
            if(value > max){
                max = value;
            }
        }

        System.out.println("Maximum element: " + max);
    }
}