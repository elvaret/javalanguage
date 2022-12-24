package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Membuat akreditas nilai mahasiwa
        Scanner userInput;
        int nilai;
        String NIM, Nama, Mata_Kul;

        userInput = new Scanner(System.in);
        System.out.print("Masukkan NIM mahasiswa = ");
        NIM = userInput.next();
        System.out.print("Masukkan nama mahasiswa = ");
        Nama = userInput.next();
        System.out.print("Masukkan Matkul = ");
        Mata_Kul = userInput.next();
        System.out.print("masukkan nilai mahasiswa = ");
        nilai = userInput.nextInt();


        if (nilai <= 100 && nilai >= 86) {
            System.out.println("Mendapatkan nilai A");
            System.out.println("Lulus");
        } else if (nilai < 86 && nilai >= 71) {
            System.out.println("mendapatkan nilai B");
            System.out.println("Lulus");
        } else if (nilai < 71 && nilai >= 61) {
            System.out.println("mendapatkan nilai C");
            System.out.println("Lulus");
        } else if (nilai < 61 && nilai >= 51) {
            System.out.println("mendapatkan nilai D");
            System.out.println("Tidak Lulus");
        } else if (nilai < 60 && nilai >= 40) {
            System.out.println("mendapatkan nilai E");
            System.out.println("Tidak Lulus");
        }else{
            System.out.println("Nilai tidak terdaftar");
        }

    }
}
