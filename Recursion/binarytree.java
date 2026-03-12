import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class binarytree {

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while(current != null || !stack.isEmpty()){

            while(current != null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data + " ");

            current = current.right;
        }
    }
}