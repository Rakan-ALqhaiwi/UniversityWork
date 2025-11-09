/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.printing_stars_in_different_shapes;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Printing_stars_in_different_shapes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the required shape number : "
                + "\n"
                + "Figure 1 : \n******"
                + "\n"
                + "Figure 2 : \n*\n"
                + "*\n"
                + "*\n"
                + "*\n"
                + "*\n"
                + "*"
                + "\nFigure 3 : \n"
                + "******\n"
                + "******\n"
                + "******\n"
                + "******\n"
                + "******\n"
                + "******"
                + "\nFigure 4 : \n"
                + "*\n"
                + "**\n"
                + "***\n"
                + "****\n"
                + "*****"
                + "\nFigure 5 : *\n"
                + " *\n"
                + "  *\n"
                + "   *\n"
                + "    *\n"
                + "     *"
                + "\nFigure 6 :      *\n"
                + "    **\n"
                + "   ***\n"
                + "  ****\n"
                + " *****"
                + "\nFigure 7 :       *\n"
                + "     *\n"
                + "    *\n"
                + "   *\n"
                + "  *\n"
                + " *"
                + "\nFigure 8 :      \n"
                + "     *\n"
                + "    ***\n"
                + "   *****\n"
                + "  *******\n"
                + " *********\n"
                + "***********\n"
                + " *********\n"
                + "  *******\n"
                + "   *****\n"
                + "    ***\n"
                + "     *"
                + " \n");

        int n = in.nextInt();
        System.out.println("Number of stars :");
        int x = in.nextInt();
        switch (n) {
            case 1:

                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
                break;
            case 2:

                for (int i = 0; i < x; i++) {
                    System.out.println("*");
                }
                break;
            case 3:

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < x; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 4:

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 5:

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                break;
            case 6:

                for (int i = 1; i <= x; i++) {
                    for (int j = 0; j < x - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 7:

                for (int i = x - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                break;
            case 8:

                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < x - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

                for (int i = x - 2; i >= 0; i--) {
                    for (int j = 0; j < x - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;

            default:
                System.out.println("eror");

        }

    }

}
