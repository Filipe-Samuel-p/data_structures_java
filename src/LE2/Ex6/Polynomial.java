package LE2.Ex6;

import java.util.Scanner;

public class Polynomial {


    private static class NodePoly{
        int coefficient;
        int degree;
        NodePoly link;
    }

    private static NodePoly createPoly(){
        return new NodePoly();
    }

    private static boolean empty(NodePoly head){
        return head.link == null;
    }

    private static void insertNodePoly(NodePoly head, int coef, int degree){
        NodePoly newNode = new NodePoly();
        newNode.coefficient = coef;
        newNode.degree = degree;
        newNode.link = null;

        if(empty(head)){
            head.link = newNode;
        }
        else{
            NodePoly currentNode = head.link;
            while (currentNode.link != null){
                currentNode = currentNode.link;
            }
            currentNode.link = newNode;
        }
    }

    private static void insertCoeffcient(NodePoly head, int degree){
        Scanner input = new Scanner(System.in);

        while (degree >= 0){
            System.out.printf("Entre com o coeficiente do expoente de grau %d: ", degree);
            int coef = input.nextInt();
            insertNodePoly(head,coef,degree);
            degree--;
        }
    }

    private static void sumOfPoly(NodePoly headPoly1, NodePoly headpoly2, NodePoly headPoly3){

        NodePoly aux1 = headPoly1.link, aux2 = headpoly2.link;

        do{
            if(aux1 == null && aux2!= null ){
                insertNodePoly(headPoly3,aux2.coefficient,aux2.degree);
                aux2 = aux2.link;
            }
            else if(aux1 != null  && aux2 == null ){
                insertNodePoly(headPoly3,aux1.coefficient,aux1.degree);
                aux1= aux1.link;
            }

            else {
                assert aux1 != null;
                if(aux1.degree == aux2.degree){
                    int sum = aux1.coefficient + aux2.coefficient;
                    insertNodePoly(headPoly3, sum, aux1.degree);
                    aux1 = aux1.link;
                    aux2 = aux2.link;
                }
                else if(aux1.degree > aux2.degree){
                    insertNodePoly(headPoly3,aux1.coefficient,aux1.degree);
                    aux1 = aux1.link;
                }
                else{
                    insertNodePoly(headPoly3, aux2.coefficient,aux2.degree);
                    aux2 = aux2.link;
                }
            }
        } while(!(aux1 == null && aux2 == null));
    }

    private static void showPoly(NodePoly head){
        if(empty(head)){
            System.out.println("\nA lista esta vazia\n");
            return;
        }
        else{
            NodePoly currentNode = head.link;
            while(currentNode != null){
                System.out.printf("%dx^%d\t", currentNode.coefficient, currentNode.degree);
                currentNode = currentNode.link;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NodePoly head1 = createPoly();
        NodePoly head2 = createPoly();
        NodePoly head3 = createPoly();

        int degree;

        System.out.println("**** Entre com o grau do polinomio 1 ****\n");
        System.out.print("Digite o grau: ");
        degree = input.nextInt();
        insertCoeffcient(head1,degree);

        System.out.println("\n\n**** Entre com o grau do polinomio 2 ****\n");
        System.out.print("Digite o grau: ");
        degree = input.nextInt();
        insertCoeffcient(head2,degree);

        System.out.println("\n");
        showPoly(head1);
        showPoly(head2);
        sumOfPoly(head1,head2,head3);
        showPoly(head3);

    }
}
