package Task6;

public class MergeSort {
    public static void main(String[] args) {
        int[] x = {20, 50, 30, 70, 10};

        for (int i = 0; i < x.length; i++) {
            sort(x, 0, x.length - 1);
            System.out.println(x[i]);
        }
    }


    static void mergeArrays(int arr[], int left, int mid, int right) {

        int size1 = mid - left + 1;
        int size2 = right - mid;

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for (int i = 0; i < size1; i++) {
            arr1[i] = arr[i + left];
        }
        for (int i = 0; i < size2; i++) {
            arr2[i] = arr[i + mid + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < size1) {
            arr[k++] = arr1[i++];
        }
        while (j < size2) {
            arr[k++] = arr2[j++];
        }

    }

    static void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            mergeArrays(arr, left, mid, right);
        }
    }
}
