package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int month = 9;

        if (month>=1 && month<3 || month==12 ) {
            System.out.println("Зима");
        }
        else if (month>2 && month<5) {
            System.out.println("Весна");
        }
        else if (month>5 && month<8){
            System.out.println("Лето");
        }
        else if (month>8 && month<12) {
            System.out.println("Осень");
        }
        else
            System.out.println("Не сезоны");

        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Не сезоны");

        }
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        {
            System.out.println();
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        {
            System.out.println();
        }

        int[][] squareArray = new int[3][2];
        squareArray[0][0] = 1;
        squareArray[0][1] = 9;
        squareArray[1][0] = 5;
        squareArray[1][1] = 3;
        squareArray[2][0] = 7;
        squareArray[2][1] = 8;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(squareArray[i][j] + "["+i+"]["+j+"]" + " ");
            }
            System.out.println();
        }
    }

}