package com.runtutuan;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai_java, nilai_sql, nilai_serv_jsp;
        System.out.println("Masukkan Nilai Pemrograman Java: ");
        nilai_java = input.nextInt();
        System.out.println("Masukkan Nilai SQL: ");
        nilai_sql = input.nextInt();
        System.out.println("Masukkan Nilai Servient dan JSP: ");
        nilai_serv_jsp = input.nextInt();
        System.out.println("Nilai Pemrograman Java: " + nilai_java);
        System.out.println("Nilai SQL: " + nilai_sql);
        System.out.println("Nilai Servient dan JSP: " + nilai_serv_jsp);
    }
}
