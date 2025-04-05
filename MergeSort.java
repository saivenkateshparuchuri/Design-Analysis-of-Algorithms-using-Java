import java.util.*;
class MergeSort {
    // Function to merge the subarrays of arr[]
    static void merge(int arr[], int beg, int mid, int end) {
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        // Temporary arrays
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];
        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            LeftArray[i] = arr[beg + i];
        for (int j = 0; j < n2; j++)
            RightArray[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = beg;
        // Merge the temp arrays back into arr[]
        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
      
        // Copy the remaining elements of LeftArray[]
        while (i < n1) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        // Copy the remaining elements of RightArray[]
        while (j < n2) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
    // Merge Sort function
    static void mergeSort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    // Function to print the array
    static void printArray(int arr[]) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {12, 31, 25, 8, 32, 17, 40, 42};
        int n = arr.length;

        System.out.println("Before sorting array elements are:");
        printArray(arr);

        mergeSort(arr, 0, n - 1);

        System.out.println("After sorting array elements are:");
        printArray(arr);
    }
}
