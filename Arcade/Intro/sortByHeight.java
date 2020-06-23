int[] sortByHeight(int[] a) {
        if (a == null || a.length < 2) {
            return a;
        }
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            if (a[l] == -1) {
                l++;
            } else if (a[r] == -1) {
                r--;
            } else {
                insertionSort(a, l, r);
                l++;
            }
        }
        return a;
    }

    private void insertionSort(int a[], int l, int r) {
        for (int i = r; i >= l; i--) {
            if (a[i] != -1 && a[i] < a[l]) {
                swap(a, i, l);
            }
        }
    }