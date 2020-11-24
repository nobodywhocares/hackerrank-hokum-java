/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nobodywhocares.hackerrank;

/**
 *
 * @author noahn
 */
public class FloatingPointMath {

    public static void main(String[] args) {
        try {
            int mask = 0x000F;
            int value = 0x2222;
            System.out.println(value & mask);

            Float fl = Float.parseFloat("3.0");
            int x = fl.intValue();
            byte b = fl.byteValue();
            double d = fl.doubleValue();
            System.out.println(x + b + d);
            
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }
        
}
