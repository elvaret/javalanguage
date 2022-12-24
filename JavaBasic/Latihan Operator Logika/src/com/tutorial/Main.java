package com.tutorial;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Membuat sebuah objek untuk menangkap input dari user
        Scanner userInput = new Scanner(System.in);

        // Sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        System.out.print("masukkan nilai tebakan anda: ");
        nilaiTebakan = userInput.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);

        //Operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda : " + statusTebakan);

        // Operasi aljabar boolean(and / or)
        System.out.print("masukkan nilai diantara 4 dan 9: ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan <9);
        System.out.println("tebakan anda adalah : " + statusTebakan);
    }
}
