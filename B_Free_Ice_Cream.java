package com.mycompany.b_free_ice_cream;

import java.util.Scanner;

public class B_Free_Ice_Cream {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long x = in.nextLong();
        int c = 0;
        for (int i = 0; i < n; i++) {
            String a = in.next();
            long d = in.nextLong();
            switch (a) {
                case "+":
                    x = x + d;
                    break;
                case "-":
                    if (x >= d) {
                        x = x - d;
                    } else {
                        c++;
                    }
                    break;
            }
        }
        System.out.println(x + " " + c);
    }
}
