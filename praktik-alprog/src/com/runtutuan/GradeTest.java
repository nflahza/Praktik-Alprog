package com.runtutuan;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai: ");
        int nilai = input.nextInt();
        boolean A = false, B = false, C = false, D = false;
        if ((nilai >= 90) && (nilai <= 100)) {
            A = true;
        } else if ((nilai >= 80 ) && (nilai <= 89)) {
            B = true;
        } else if ((nilai >= 70) && (nilai <= 79)) {
            C = true;
        } else if ((nilai >= 60) && (nilai <= 69)) {
            D = true;
        }
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}
