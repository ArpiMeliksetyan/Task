import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

//        Task1 - Create an array and fill it with 2 number

        int x = 10;
        int y = 2;
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = y;
        }


        //        Task2 - Create an array and fill it numbers from 1:1000

        int x1 = 1000;
        int[] array1 = new int[x1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
            System.out.println(array1[i] + " ");
        }


        //        Task3 - Create an array and fill it with odd numbers from -20:20

        int z = -20;
        int z1 = 20;
        int k = 0;
        int[] array2 = new int[z1];

        for (int i = 0; i < z1 * 2; i++) {
            if (z % 2 != 0) {
                array2[k] = z;
                k++;
            }
            z++;
        }


        //        Task4 - Create an array and fill it. Print all elements that can be divided by 5.

        int[] array3 = {1, 10, 15, 24, 9, 7, 40, 60, 62, 99, 100};
        int k1 = 5;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 5 == 0) {
                System.out.println(array3[i]);
            }
        }

        //        Task5 - Create an array and fill it. Print all elements which are between 24.12  and 467.23

        double[] array4 = {10.1, 0.5, 7.0, 48.4, -8.5, 565.2, 460.0, -78, 30.5};

        for (int i = 0; i < array4.length; i++) {
            if (array4[i] >= 24.12 && array4[i] <= 467.23) {
                System.out.println(array4[i]);
            }

        }

        //        Task6 - Create an array and fill it. Print count of elements which can be divided by 2.

        int[] array5 = {10, 4, 55, 67, 3, 78, 11};
        int count = 0;

        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

//        Task7 - Given an integer, 0 < N < 21, print its first 10 multiples.
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        if (n1 > 0 && n1 < 21) {
            for (int i = 1; i <= 10; i++) {
                int sum = i * n1;
                System.out.println(n1 + " " + "*" + " " + i + " " + "=" + " " + sum);
            }

        } else {
            System.out.println("Please enter number from the right range");
        }
        
        //        Additional Task - Given an array. Find if the element of an array is a scale of 2.

        int[] a = {12, 8, 3, 4, 16, 1};
        boolean isScale = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                while (a[i] >= 2) {
                    if (a[i] % 2 == 0) {
                        isScale = true;
                    } else {
                        isScale = false;
                        break;
                    }
                    a[i] = a[i] / 2;

                }
            } else {
                isScale = false;
            }


            System.out.println(isScale + " ");


        }

    }
}
