/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nobodywhocares.hackerrank;

import java.util.Arrays;

/**
 *
 * @author noahn
 */
public class Sorting {

    public static void main(String[] args) {
        try {
            int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
            printSorted("Counting", executeSortCounting(a));
            a = new int[]{10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
            printSorted("Bubble", executeSortBubble(a));
            a = new int[]{10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
            printSorted("Merge", executeSortMerge(a, a.length));
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    public static void printSorted(String alg, int[] arr) {
        System.out.println(String.format("Printing %s Sorted List ...", alg));
        for (int i = 0, len = arr.length; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] executeSortCounting(int[] input) {
        // Determine K max input value
        int k = 0;
        for (int i : input) {
            if (i > k) {
                k = i;
            }
        }

        // Count each value
        int[] c = new int[k + 1];
        Arrays.fill(c, 0);

        for (int i : input) {
            c[i] += 1;
        }

        for (int i = 1; i < c.length; i++) {
            c[i] += c[i - 1];
        }

        int[] sorted = new int[input.length];
        for (int i = input.length - 1; i >= 0; i--) {
            int current = input[i];
            sorted[c[current] - 1] = current;
            c[current] -= 1;
        }

        return sorted;
    }

    public static int[] executeSortBubble(int[] a) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void executeSortMergeImpl(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static int[] executeSortMerge(int[] a, int n) {
        if (n < 2) {
            return a;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        executeSortMerge(l, mid);
        executeSortMerge(r, n - mid);

        executeSortMergeImpl(a, l, r, mid, n - mid);
        return a;
    }
}
