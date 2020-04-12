public class QuickSort implements SortingAlgorithm {

    void swap(int[]a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void sort(int[]a) {
        int begin = 0;
        int end = a.length - 1;
        sort(a, begin, end);
    }

    public void sort (int [] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            sort(arr, left, p-1);
            sort(arr, p+1, right);
        }
    }

    int partition (int [] arr, int left, int right) {
        if (left < right) {
            int pivot = left;
            int i = left + 1; // Avoids re-sorting the pivot
            int j = right;
            while (i < j) {
                while (i <= right && arr[i] <= arr[pivot]) {
                    ++i;
                }
                while (j >= i && arr[j] > arr[pivot]) {
                    --j;
                }
                if (i <= right && i < j) {
                    swap(arr, i, j);
                }
            }
            swap(arr, pivot, j);  // pivot to the middle
            return j;
        }
        return left;
    }
}
