package LE2.Ex1.part3;

import LE2.Ex1.part2.ProgramPart1_2;

public class Stack<T> implements StackContract<T>{

    private class Node{
        T data;
        Node link;

        public Node(){}
        public Node(T data){
            this.data = data;
        }
    }

    private Node head;

    @Override
    public boolean empty() {
        return head == null;
    }


    @Override
    public void pop() {
        if(empty()){
            System.out.println("Empty");
        }
        else{
            Node aux = head;
            head = aux.link;
            aux = null;
        }
    }

    @Override
    public void push(T data) {
        Node newNode = new Node(data);

        if(empty()){
            head = newNode;
        }
        else{
            Node aux = head;
            head = newNode;
            newNode.link = aux;
        }
    }

    @Override
    public T topElement() {
        return head.link.data;
    }

    @Override
    public void showList() {
        if(empty()){
            System.out.println("Empty");
        }
        else{
            Node aux = head;
            while (aux != null){
                System.out.println("|" + aux.data + "|");
                aux = aux.link;
            }
        }
    }
}
