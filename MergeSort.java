public class MergeSort implements SortingAlgorithm {

    public void sort(int[]a) {
        mergeSort(a, a.length);
    }

    public void mergeSort(int[] a, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r); //mid, n - mid
    }

    public int[] getLeft(int[] a) {
        return a;
    }

    public int[] getRight(int[]a) {
        return a;
    }

    public void merge(int[]a, int[]left, int[]right) {
        int target_index = 0;
        int left_index = 0;
        int right_index = 0;
        while(left_index < left.length && right_index < right.length) {
            if(left[left_index] <= right[right_index]) {
                a[target_index] = left[left_index];
                target_index++;
                left_index++;
            }
            else {
                a[target_index] = right[right_index];
                target_index++;
                right_index++;
            }
        }
        while(left_index < left.length) {
            a[target_index++] = left[left_index++];
        }
        while(right_index < right.length) {
            a[target_index++] = right[right_index++];
        }
    }
}
