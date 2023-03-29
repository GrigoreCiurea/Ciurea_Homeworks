package org.example.homework_nr_4;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("First exercise:");
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 4;
        array[2] = 8;
        array[3] = 13;
        array[4] = 3;

        for (int i = 0; i != array.length; i++) {
            System.out.println("Index[" + array[i] + "];");
        }
        System.out.println();
        System.out.println("Second exercise");
        System.out.println();

        int[] secondArray = new int[]{3, 4, 7, 12, 25};
        int[][] thirdArray = new int[][]{
                {3, 12, 33, 9, 13},
                {5, 7, 8, 6, 11}
        };

        int sum = 0;
        for (int j = 0; j != secondArray.length; j++) {
            sum += secondArray[j];

        }
        System.out.println("1.1. Sum of elements in my second array is: " + sum);
        double averageValue = ((double) sum) / secondArray.length;
        System.out.println("1.2. Average value in my second array is: " + averageValue);
 int ciot = 0;
for(int m = 0; m != thirdArray.length; m++){
    for( int k = 0; k != thirdArray[m].length; k++) {
        if (thirdArray[m][k] % 2 == 0) {
            ciot++;
        }
    }
}
        System.out.println("2.1. The number of even numbers in array is: " + ciot);

        int neciot = 0;
        for(int m = 0; m != thirdArray.length; m++){
            for( int k = 0; k != thirdArray[m].length; k++) {
                if (thirdArray[m][k] % 2 != 0) {
                    neciot++;
                }
            }
        }
        System.out.println("2.2. The number of odd numbers in array is: " + neciot);

        System.out.println();
        System.out.println("Third exercise:");
        System.out.println();


        String[] stringArray = new String[]{"Alexandr", "Pavel", "Daniil", "Dmitrii", "Arteom"};
        for (int a = 0; a != stringArray.length; a++){
            System.out.println("Print stringArray: " + stringArray[a]);
        }
        System.out.println("****************************");
        String copyArray[] ;
        copyArray = stringArray;
        for (int b = 0; b != copyArray.length; b++){
            System.out.println("Print copied array: " + copyArray[b] + " ");
        }
    }
}
