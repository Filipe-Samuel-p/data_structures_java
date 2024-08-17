package LE2.Ex1.part2;

import java.util.Scanner;

public class ProgramPart1_2 {

    private static class NodeStack{
        int data;
        NodeStack link;
    }

    private static class HeadStack{
        int topElement;
        NodeStack topNode;
    }

    public static HeadStack creteStack(){
        HeadStack head = new HeadStack();
        head.topNode = null;
        return head;
    }

    private static boolean empty(HeadStack head){
        return head.topNode == null;
    }

    private static void push(HeadStack head, int number){
        NodeStack newNode = new NodeStack();
        newNode.data = number;
        head.topElement = newNode.data;

        if(empty(head)){
            head.topNode = newNode;
            newNode.link = null;
        }
        else{
            NodeStack aux = head.topNode;
            head.topNode = newNode;
            newNode.link = aux;
        }
    }

    private static void pop(HeadStack head){
        if(empty(head)){
            System.out.println("\nEmpty\n");
        }
        else{
            NodeStack aux = head.topNode;
            head.topNode = aux.link;
            head.topElement = aux.link.data;
            aux = null;
        }
    }

    private static void topElement(HeadStack head){
        if(empty(head)){
            System.out.println("\nEmpty\n");
        }
        else{
            System.out.println("Top element: " + head.topElement);
        }
    }

    private static void freeStack(HeadStack head){
        if(empty(head)){
            head.topNode = null;
        }
        else{
            NodeStack aux = head.topNode;
            while (aux != null){
                NodeStack aux2 = aux;
                aux = aux.link;
                aux2 = null;
            }
            head.topNode = null;
            System.out.println("\n Free list\n");
        }
    }

    private static void showStack(HeadStack head){
        if(empty(head)){
            System.out.println("\nLista Vazia");
        }
        else{
            NodeStack aux = head.topNode;
            while (aux != null){
                System.out.println("|" + aux.data + "|");
                aux = aux.link;
            }
        }
    }

    public static void main(String[] args) {

        int option;
        Scanner input = new Scanner(System.in);
        HeadStack headStack = creteStack();

        do {

            System.out.println("\n ***** Escolha Uma opção *****\n");
            System.out.print("Stack : \n");
            showStack(headStack);

            System.out.println("\n\n1- Inserir elemento na pilha");
            System.out.println("2- Remover elemento da pilha");
            System.out.println("3- Mostrar o ultimo elemento da pilha");
            System.out.println("4- Liberar a stack");
            System.out.println("5- Sair");
            System.out.print("Escolha a opcao: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nEnter a number: ");
                    int number = input.nextInt();
                    push(headStack,number);
                    break;

                case 2:
                    pop(headStack);
                    break;
                case 3:
                    topElement(headStack);
                    break;
                case 4:
                    freeStack(headStack);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while (option != 5);
        input.close();
    }
}
