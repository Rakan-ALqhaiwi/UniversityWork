package com.mycompany.exam_question;

import java.util.Scanner;

public class Exam_Question {

    public static void main(String[] args) {
        Smartphone a[] = new Smartphone[5];
        fillArr(a);
        prant(a);

    }

    public static void fillArr(Smartphone a[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = new Smartphone();
            System.out.print("Enter brand: ");
            a[i].setBrand(in.next());
            System.out.print("Enter storage: ");
            a[i].setStorage(in.nextInt());
        }

    }

    public static void prant(Smartphone a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].getBrand().equals("Apple")) {
                if (a[i].getStorage() >= 512) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
