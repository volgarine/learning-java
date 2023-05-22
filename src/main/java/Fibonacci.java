package org.example;

public class Fibonacci {
        public static void main(String[]args) {
            int lo = 1;
            int hi = 1;

            System.out.println(lo);
            while (hi < 50){
                System.out.println(hi);
                hi = lo + hi;
                lo = hi - lo;
//            PRINT Fibonacci: 1, 1, 2, 3, 5, 8, 13, 21, 34
            }
        }
    }
