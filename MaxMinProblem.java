class Pair {
    int min, max;
}

public class MaxMinProblem {
    static Pair getMinMax(int arr[], int low, int high) {
        Pair minmax = new Pair(), mml, mmr;
        int mid;
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }
        
        mid = (low + high) / 2;
        mml = getMinMax(arr, low, mid);
        mmr = getMinMax(arr, mid + 1, high);
        
        minmax.min = Math.min(mml.min, mmr.min);
        
        minmax.max = Math.max(mml.max, mmr.max);
        
        return minmax;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = arr.length;
        Pair minmax = getMinMax(arr, 0, arr_size - 1);
        System.out.println("Minimum element is " + minmax.min);
        System.out.println("Maximum element is " + minmax.max);
    }
}
