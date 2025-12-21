class Solution {
    public int[] sortArray(int[] a) {
        qs(a, 0, a.length - 1);
        return a;
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void qs(int[] a, int st, int end) {
        if (st >= end) {
            return;
        }
        
        // Random pivot selection
        int pivotIndex = st + (int) (Math.random() * (end - st + 1));
        int pivot = a[pivotIndex];
        
        // Place pivot at the start
        swap(a, st, pivotIndex);

        // Initialize pointers for partitioning
        int i = st + 1; // Pointer for elements less than or equal to pivot
        int j = end;    // Pointer for elements greater than pivot

        while (i <= j) {
            // Find element on left side that should be on right (greater than pivot)
            while (i <= j && a[i] <= pivot) {
                i++;
            }

            // Find element on right side that should be on left (less than or equal to pivot)
            while (i <= j && a[j] > pivot) {
                j--;
            }

            // Swap elements if pointers have not crossed
            if (i < j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }

        // Place pivot in its correct position
        swap(a, st, j);

        // Recursively sort the partitioned arrays
        qs(a, st, j - 1);
        qs(a, j + 1, end);
    }
}
