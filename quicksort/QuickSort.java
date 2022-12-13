package datastructures.quicksort;

public class QuickSort {

    public static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for(int i = swapIndex + 1; i<= endIndex; i++){
            if(array[i]<array[pivotIndex] ){
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, endIndex, swapIndex);
        return swapIndex;
    }
}
