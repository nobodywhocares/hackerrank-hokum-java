/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nobodywhocares.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author noahn
 */
public class PracticeTestFizzBuzz {

    public static void main(String[] args) {
        try {
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

           
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }
    
        
}

class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        for (int next = 1, last = n+1; next < last; next++) {
            Object result = next;
            if (0 == next % 3) {
                if (0 == next % 5) {
                    result = "FizzBuzz";
                } else {
                    result = "Fizz";
                }
            } else if (0 == next % 5) {
                result = "Buzz";
            }
            System.out.println(result);            
        }
    }

}

