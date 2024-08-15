package LE2.Ex1.part3;

public interface StackContract<T> {

    boolean empty();
    void push(T data);
    void pop();
    T topElement();
    void showList();
}
