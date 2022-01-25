package com.company;

public class Main {

    public static void main(String[] args) {
        //1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //2
        int arrMax = -1;
        int arrMin = 300_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arrMax){
                arrMax = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arrMin){
                arrMin = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + arrMin + " рублей. Максимальная сумма трат за день составила " + arrMax + " рублей.");

        //3
        float sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        } float sredn = sum2/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + sredn + " рублей");

        //4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i==0);
            System.out.print(reverseFullName[i]);
        }

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
