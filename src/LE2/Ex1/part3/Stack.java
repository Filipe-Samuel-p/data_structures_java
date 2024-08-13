package LE2.Ex1.part3;

class Node<T>{
    T data;
    Node<T> link;
    public Node(){}
    public Node(T data) {
        this.data = data;
    }
}

class HeadStack<T>{
    T topElement;
    Node<T> firstNode;
}

public class Stack<T> implements StackContract{

    @Override
    public HeadStack createStack() {
        HeadStack head = new HeadStack();
        head.firstNode = null;
        return head;
    }

    @Override
    public boolean empty(HeadStack head) {
        return head.firstNode == null;
    }

    @Override
    public void pop(HeadStack head) {
        if(empty(head)){
            System.out.println("Empty");
        }
        else{
            Node<T> aux = head.firstNode;
            head.firstNode = aux.link;
            aux = null;
        }
    }

    @Override
    public void push(HeadStack head, Object element) {
        Node<T> newNode = new Node<>();

    }

    @Override
    public void showStack(HeadStack head) {

    }
}
