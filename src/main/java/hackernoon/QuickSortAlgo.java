package hackernoon;
/*

https://hackernoon.com/50-data-structure-and-algorithms-interview-questions-for-programmers-b4b1ac61f5b0
https://javarevisited.blogspot.com/2014/08/quicksort-sorting-algorithm-in-java-in-place-example.html?source=post_page---------------------------&ref=hackernoon.com#axzz7ShurB3D4

How is an integer array sorted in place using the quicksort algorithm?

https://www.youtube.com/watch?v=h8eyY7dIiN4&ab_channel=CodingwithJohn
 */


import java.util.Arrays;
import java.util.Random;

public class QuickSortAlgo {

    public static void main(String[] args) {
        int[] arr = {10,85,2,1,3,18,100,11};

        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
//        int pivot = array[highIndex];
        int pivot = array[pivotIndex];

        swap(array, pivotIndex, highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

//        quicksort(array);
        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);
    }


    private static void quicksort(int[] array) {
        quicksort(array,0, array.length - 1);
    }


    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }

        //last step
        swap(array, leftPointer, highIndex);

        return leftPointer;
    }


    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
