package com.company.aqa.module2;

/**
 * 11. Вывести на экран числа от -10 до 25 с помощью всех известных циклов.
 */
public class Task_2_11 {

    public static void main(String[] args) {

        System.out.println("---------for---------");
        for(int i = -10; i <=25 ; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\n-----------------");

        System.out.println("---------while---------");
        int x = -10;
        while (x>=-10 && x<=25) {
            System.out.print(x + ", ");
            x++;
        }
        System.out.println("\n-----------------");

        System.out.println("---------do while---------");
        x = -10;
        do {
            System.out.print(x + ", ");
            x++;
        } while (x >=-10 && x<=25);

        System.out.println("\n-----------------");

        System.out.println("---------foreach---------");
        int[]arr = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        for (int z: arr) {
            System.out.print(z + ", ");
        }
        System.out.println("\n-----------------");
    }
}
