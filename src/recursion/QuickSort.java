package recursion;

import java.util.Scanner;

public class QuickSort {

    public static int[] createVector(int size){

        int[] vector = new int[size];
        for(int index = 0; index < vector.length; index++){
            vector[index] = (int) (Math.random() * 101);
        }
        return vector;
    }

    private static int partition(int[] array, int left, int right){
        int pivot = array[right];
        int i = left - 1;
        for(int j = left; j<right; j++){
            if(array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        return i + 1;
    }

    public static void quickSort(int[] array, int left, int right){
        if(left < right){
            int pi = partition(array, left,right);
            quickSort(array,left,pi-1);
            quickSort(array,pi + 1,right);
        }
    }

    public static void showArray(int[] array){
        for(int element: array){
            System.out.print("\t" + element);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vector's size: ");
        int size = input.nextInt();

        int[] vector = createVector(size);
        showArray(vector);
        System.out.println("\n");
        quickSort(vector,0, vector.length - 1);
        showArray(vector);

        input.close();
    }
}
