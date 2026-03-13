import java.util.Stack;

public class reverselinkedlist {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40};
        Stack<Integer> stack = new Stack<>();

        for(int i : arr)
            stack.push(i);

        for(int i=0;i<arr.length;i++)
            arr[i] = stack.pop();

        for(int i : arr)
            System.out.print(i + " ");
    }
}