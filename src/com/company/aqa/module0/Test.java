package com.company.aqa.module0;

public class Test {

    public static void main(String[] args) {
//
//        for (int i = 10; i >= 0; i--) {
//            if (i % 2 != 0)
//                System.out.println(i);
//        }

//        for (int i = 10; i > 0; i--) {
//            if (i % 2 != 0)
//                System.out.println(i);
//        }

//        for (int i = 10; i > 0; i--) {
//            System.out.println(i % 2 == 0 ? i : "ghkjgk");
//
//        }

//        int a = 1;
//        int b = 2;
//        do {c
//            System.out.println("Privet");
//        } while (a++ < b);
//        System.out.println("Bue..."+a);
        int a = 1;
        int b = 1;
        int c;
        for (int i = 0; i < 10; i++) {
            c = a + b;
            a = a + b;
//            b = c;
            System.out.println(b+a);

        }
    }
}

