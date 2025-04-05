import java.util.*;
class BinarySearch {
    // Recursive binary search function
    static int binarySearch(int arr[], int beg, int end, int val) {
        if (end >= beg) {
            int mid = beg + (end - beg) / 2;

            // If element is present at the middle
            if (arr[mid] == val)
                return mid;

            // If element is smaller than mid, search left subarray
            if (arr[mid] < val)
                return binarySearch(arr, mid + 1, end, val);

            // If element is greater than mid, search right subarray
            return binarySearch(arr, beg, mid - 1, val);
        }
        return -1; // Element not found
    }
public static void main(String args[]) {
        int arr[] = {11, 14, 25, 30, 40, 41, 52, 57, 70}; // Given array
        int val = 40; // Value to be searched
        int n = arr.length; // Size of the array

        int res = binarySearch(arr, 0, n - 1, val); // Store result

        System.out.print("The elements of the array are: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\nElement to be searched is: " + val);

        if (res == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index " + res);
    }
}
