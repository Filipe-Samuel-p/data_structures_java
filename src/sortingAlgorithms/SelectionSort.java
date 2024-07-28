package sortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {

    public static int[] createVector(int size){

        int[] vector = new int[size];
        for(int index = 0; index < vector.length; index++){
            vector[index] = (int) (Math.random() * 101);
        }
        return vector;
    }

    public static void selectionSort(int[] vector){
        int indexMinElement, varAssistant;
        for(int i = 0; i < vector.length - 1; i++) {
            indexMinElement = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[indexMinElement]) {
                    indexMinElement = j;
                }
            }
            if (indexMinElement != i) {
                varAssistant = vector[i];
                vector[i] = vector[indexMinElement];
                vector[indexMinElement] = varAssistant;
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
        selectionSort(vector);
        showVector(vector);
    }
}
