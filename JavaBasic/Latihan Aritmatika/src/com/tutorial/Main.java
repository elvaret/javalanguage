package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String input;
        Scanner userInput = new Scanner(System.in);
            System.out.print("Masukkan luas bangun apa yang ingin dihitung = ");
            input = userInput.next();
            double panjang, sisi, lebar, luas, tinggi, alas, r, phi = 3.14;
            // Membuat perhitungan menghitung luas suatu bangun
            // switch case bisa dipisah dengan : break; atau -> {}


        switch (input) {
            case "luaspersegi" -> {
                System.out.println("Menghitung luas persegi");
                System.out.print("Sisi = ");
                sisi = userInput.nextDouble();
                System.out.println("luas persegi = sisi  * sisi ");
                luas = sisi * sisi;
                System.out.println("luas = " + luas);
            }
            case "luaspersegipanjang" -> {
                System.out.println("Menghitung Luas Persegi panjang");
                System.out.print("Panjang = ");
                panjang = userInput.nextDouble();
                System.out.print("lebar = ");
                lebar = userInput.nextDouble();
                System.out.println("luas persegi panjang = panjang * lebar");
                luas = panjang * lebar;
                System.out.println("luas = " + luas);
            }
            case "luassegitiga" -> {
                System.out.println("Menghitung luas segitiga");
                System.out.print("alas = ");
                alas = userInput.nextDouble();
                System.out.print("tinggi = ");
                tinggi = userInput.nextDouble();
                System.out.println("luas segitiga = alas * tinggi /2");
                luas = alas * tinggi / 2;
                System.out.println("luas = " + luas);
            }
            case "luaslingkaran" -> {
                System.out.println("Menghitung luas lingkaran");
                System.out.print("r = ");
                r = userInput.nextDouble();
                System.out.println("phi = 3.14");
                System.out.println("luas lingkaran = phi * r * r");
                luas = phi * r * r;
                System.out.println("luas = " + luas);
            }
            default -> System.out.println("rumus belum dibuat");
        }
            System.out.println("Perhitungan selesai :)");
    }
}
