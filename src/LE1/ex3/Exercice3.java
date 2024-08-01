package LE1.ex3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice3 {

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

    public static int[] copyArray(int[] array){
       int[] copy = new int[array.length];
        for(int index = 0; index < array.length; index++){
            copy[index] = array[index];
        }
        return copy;
    }


    public static void main(String[] args) {

        int[] array = createVector(50000);
        int[] copy1 = copyArray(array);
        int[] copy2 = copyArray(copy1);

        long startTime = System.currentTimeMillis();
        bubbleSort(array);
        long endTime = System.currentTimeMillis();
        long finalTime = endTime - startTime;

        long startTime2 = System.currentTimeMillis();
        selectionSort(copy1);
        long endTime2 = System.currentTimeMillis();
        long finalTime2 = endTime2 - startTime2;

        long startTime3 = System.currentTimeMillis();
        insertionSort(copy2);
        long endTime3 = System.currentTimeMillis();
        long finalTime3 = endTime3 - startTime3;

        System.out.println("Bubble sort: " + finalTime);
        System.out.println("Selection sort: " + finalTime2);
        System.out.println("Insertion sort: " + finalTime3);

    }




}
