package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // program untuk menjumlahkan angka dengan rentang tertentu
        {
            System.out.println("ini adalah awal program pertama");
            int nilaiAwal, nilaiAkhir, total;
            Scanner inputUser = new Scanner(System.in);
            System.out.print("Masukkan nilai Awal = ");
            nilaiAwal = inputUser.nextInt();
            System.out.print("Masukkan nilai Akhir = ");
            nilaiAkhir = inputUser.nextInt();

            total = 0;
            while (nilaiAwal <= nilaiAkhir) {
                total = total + nilaiAwal;
                System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
                nilaiAwal++;
            }
            System.out.println("Program pertama selesai");
        }
        {
            System.out.println("ini adalah awal program kedua");
            int nilaiAwal, nilaiAkhir, total;
            Scanner inputUser = new Scanner(System.in);
            System.out.print("Masukkan nilai Awal = ");
            nilaiAwal = inputUser.nextInt();
            System.out.print("Masukkan nilai Akhir = ");
            nilaiAkhir = inputUser.nextInt();

            total = 0;
            //do while
            do {
                total = total + nilaiAwal;
                System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
                nilaiAwal++;
            } while (nilaiAwal <= nilaiAkhir);

            System.out.println("Program kedua selesai");
        }

        {
            System.out.println("ini adalah awal program ketiga");
            int nilaiAwal, nilaiAkhir, total;
            Scanner inputUser = new Scanner(System.in);
            System.out.print("Masukkan nilai Awal = ");
            nilaiAwal = inputUser.nextInt();
            System.out.print("Masukkan nilai Akhir = ");
            nilaiAkhir = inputUser.nextInt();

            //for while
            for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
                total = total + nilaiAwal;
                System.out.println("Ditambah " + nilaiAwal + " Menjadi " + total);
                System.out.println("Program ketiga selesai");
            }
        }
        {
            System.out.println("ini adalah awal program keempat");
            int nilaiAwal, nilaiAkhir, total;
            Scanner inputUser = new Scanner(System.in);
            System.out.print("Masukkan nilai Awal = ");
            nilaiAwal = inputUser.nextInt();
            System.out.print("Masukkan nilai Akhir = ");
            nilaiAkhir = inputUser.nextInt();

            total = nilaiAwal--;
            while (nilaiAwal >= nilaiAkhir) {
                total = total - nilaiAwal;
                System.out.println("dikurang " + nilaiAwal + " menjadi " + total);
                nilaiAwal--;

            }
            System.out.println("Program keempat selesai");
        }
    }
}

