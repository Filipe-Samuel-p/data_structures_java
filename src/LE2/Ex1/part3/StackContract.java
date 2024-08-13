package LE2.Ex1.part3;

public interface StackContract<T> {

    HeadStack createStack();
    boolean empty(HeadStack head);
    void push(HeadStack head, T element);
    void pop(HeadStack head);
    void showStack(HeadStack head);
}
