package lab6;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};  // Define the array
        System.out.println(Arrays.toString(values));  // Print original array

        swap(values, 1, 0);  // Swap elements at indices 1 and 0
        System.out.println(Arrays.toString(values));  // Print array after swap

        swap(values, 0, 3);  // Swap elements at indices 0 and 3
        System.out.println(Arrays.toString(values));  // Print array after second swap
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];  // Store the value at index1 in a temporary variable
        array[index1] = array[index2];  // Assign the value at index2 to index1
        array[index2] = temp;  // Assign the value in temp (original index1) to index2
    }
}
