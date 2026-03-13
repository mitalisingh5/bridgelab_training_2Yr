class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class StackLL {
    Node top;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    void pop(){
        if(top == null){
            System.out.println("Stack Empty");
            return;
        }
        top = top.next;
    }

    void peek(){
        if(top != null)
            System.out.println("Top: " + top.data);
    }
}

public class Main{
    public static void main(String[] args){
        StackLL s = new StackLL();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek();
        s.pop();
        s.peek();
    }
}
