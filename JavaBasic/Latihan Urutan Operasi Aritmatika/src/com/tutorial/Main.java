package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kesimpulan
        // 1. Perkalian atau pembagian kan dilakukan terlebih dahulu
        // 2. Jika dilakukan perkalian dan pembagian, maka akan dilakukan operasi dari kiri ke kanan

        double hasil = 5 * 10 /2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // Menggunakan pengelompokkan operasi dengan ()
        hasil = 60 / (10 + 5);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // Perhitungan persamaan kuadrat
        System.out.println("Menghitung Persamaan kuadrat");
        double m, x, c;
        System.out.print("nilai x = ");
        x = userInput.nextDouble();
        System.out.print("gradient m = ");
        m = userInput.nextDouble();
        System.out.print("c = ");
        c = userInput.nextDouble();
        double y = (m * x * x) + c;
        System.out.println("nilai y = " + y);
    }
}
