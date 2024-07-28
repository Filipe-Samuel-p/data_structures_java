package sortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {

    public static int[] createVector(int size){

        int[] vector = new int[size];
        for(int index = 0; index < vector.length; index++){
            vector[index] = (int) (Math.random() * 101);
        }
        return vector;
    }

    public static void insertionSort(int[] vector){
        for(int j = 1; j < vector.length; j++){
            int key = vector[j];
            int i = j - 1;
            while(i >= 0 &&  vector[i] > key){
                vector[i + 1] = vector[i];
                i -= 1;
            }
            vector[i + 1] = key;
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
        insertionSort(vector);
        showVector(vector);
    }
}
