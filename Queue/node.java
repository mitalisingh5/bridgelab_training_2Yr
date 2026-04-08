package Quene;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class node {
    Node front;
    Node rear;
    int size;
    node(){
        this.front=null;
        this.rear=null;
        this.size=0;
    }
    void insertFront(int val){
        Node newNode=new Node(val);
        if(front==null){
            front=rear=newNode;
            return;
        }else{
            newNode.next=front;
            front.prev=newNode;
            front=newNode;

         }
        }
        void insertatrear(int val){
            Node newNode=new Node(val);
            if(rear==null){
                front=rear=null;
                return;
            }else{
                rear.next=newNode;
                newNode.prev=rear;
                rear=newNode;
            }
        }
    }