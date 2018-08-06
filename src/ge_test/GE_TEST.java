/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge_test;

/**
 *
 * @author user
 */
public class GE_TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[]{-1, 4, -2, 88, 45, 100};
        int result = sumOfTwoLargestElements(a);
        System.out.println("Result of sum of largest two numbers is : " + result);

        int result2 = getClosesToZero(a);
        System.out.println("Result of Closer number of zero is :" + result2);

        for (int i = 2; i <= 1500; i++) {

            System.out.println("Factors for number : " + i);
            factors(i);
            System.out.println("____________________________");

        }
    }

    public static int sumOfTwoLargestElements(int[] a) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }

        return max1 + max2;

    }

    public static int getClosesToZero(int[] a) {

        int d = Integer.MAX_VALUE;
        for (int num : a) {
            if (d >= Math.abs(num)) {
                d = num;
            }
        }

        return d;
    }

    public static void factors(int num) {
        if (num == 1) {
            return;
        }

        if ((num % 2) == 0) {
            System.out.println("2");
            factors(num / 2);
        } else {
            if ((num % 3) == 0) {
                System.out.println("3");
                factors(num / 3);
            } else {
                if ((num % 5 == 0)) {
                    System.out.println("5");
                    factors(num / 5);
                }
            }
        }
    }

}
