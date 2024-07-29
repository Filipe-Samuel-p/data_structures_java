package sortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

    public static int[] createVector(int size){

        int[] vector = new int[size];
        for(int index = 0; index < vector.length; index++){
            vector[index] = (int) (Math.random() * 101);
        }
        return vector;
    }


    public static void bubbleSort(int[] vector){

        boolean change = true;
        int varAssistant;
        while (change){
            change = false;
            for(int index = 0; index < vector.length - 1; index++){
               if (vector[index] > vector[index + 1]){
                        varAssistant = vector[index];
                        vector[index] = vector[index + 1];
                        vector[index + 1] = varAssistant;
                        change = true;
                }
            }
        }
    }

    public static void showVector(int[] vector){
        for(int element: vector){
            System.out.print("\t" + element);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter vector's size: ");
        int size = input.nextInt();

        int[] vector = createVector(size);
        showVector(vector);
        System.out.println("\n");
        bubbleSort(vector);
        showVector(vector);

        input.close();
    }
}
