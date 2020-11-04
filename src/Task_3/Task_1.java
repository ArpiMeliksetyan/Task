package Task_3;

public class Task_1 {
    public static void main(String[] args) {

//        Task_1 - implement Bubble sort
        int[] array = {5, 1, 0, 23, -5, 101, 45};
        Task_1 task_3 = new Task_1();
        task_3.bubbleSort(array);

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }

    }


    public void bubbleSort(int[] array) {
        boolean isSwaped = false;
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwaped = true;

                }

            }
            if (!isSwaped) {
                break;
            }
        }
    }
}

