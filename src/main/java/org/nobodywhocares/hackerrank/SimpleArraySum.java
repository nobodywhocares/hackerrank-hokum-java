/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nobodywhocares.hackerrank;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author noahn
 */
public class SimpleArraySum {

    private static final Scanner scanner = new Scanner(System.in);

    protected static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
//        int sum = 0;
//        for (int idx = 0; idx < ar.length; idx++) {
//            sum += ar[idx];
//        }
//        for (int val : ar) {
//            sum += val;
//        }
//        return sum;
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        try {
            
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int arCount = Integer.parseInt(scanner.nextLine().trim());

            int[] ar = new int[arCount];

            String[] arItems = scanner.nextLine().split(" ");

            for (int arItr = 0; arItr < arCount; arItr++) {
                int arItem = Integer.parseInt(arItems[arItr].trim());
                ar[arItr] = arItem;
            }

            int result = simpleArraySum(ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }
}
