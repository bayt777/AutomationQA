package com.company.aqa.module2;

class Arr {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4};
////        int[] arr2 = new int[]{10, 15, 25, 30, 48};
////        arr[0] = 594;
////        System.out.println(arr[0]);
////
////    }

//        int[] arr= new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i++;
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr[arr.length-2]);
//        System.out.println(Arrays.toString(arr));

        String[][] arr = new String[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "*";
            }
//            System.out.println(Arrays.toString());
        }

    }
}