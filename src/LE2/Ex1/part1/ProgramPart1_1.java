package LE2.Ex1.part1;

import java.util.Scanner;

public class ProgramPart1_1 {

    private static class Stack{
         int top;
         final int[] stackItems = new int[10];
    }

    private static void startStack(Stack stack){
        stack.top = -1;
    }

    private static boolean empty(Stack stack){
        return stack.top == -1;
    }

    private static void push(Stack stack){
        Scanner input = new Scanner(System.in);

        if(stack.top + 1 == 10){
            System.out.println("\nOverflow\n");
            return;
        }
        System.out.println("\nDigite um número: ");
        int number = input.nextInt();
        stack.top++;
        stack.stackItems[stack.top] = number;
    }

    private static void pop(Stack stack) {

        if (empty(stack)) {
            System.out.println("\nUnderflow\n");
            return;
        }
        stack.stackItems[stack.top] = 0;
        stack.top--;
    }

    private static void topElement(Stack stack){
        if(empty(stack)){
            return;
        }
        System.out.println(stack.stackItems[stack.top]);
    }

    private static void showStack(Stack stack){
       for(int index = stack.stackItems.length - 1; index >= 0; index--){
           System.out.println("|" + stack.stackItems[index] + "|");
       }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        int option;
        Scanner input = new Scanner(System.in);
        startStack(stack);

        do {

            System.out.println("\n ***** Escolha Uma opção *****\n");
            System.out.print("Stack : \n");
            showStack(stack);

            System.out.println("\n\n1- Inserir elemento na pilha");
            System.out.println("2- Remover elemento da pilha");
            System.out.println("3- Mostrar o ultimo elemento da pilha");
            System.out.println("4- Sair");
            System.out.print("Escolha a opcao: ");
            option = input.nextInt();


            switch (option) {
                case 1:
                    push(stack);
                    break;

                case 2:
                    pop(stack);
                    break;
                case 3:
                    topElement(stack);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while (option != 4);

    }
}
