package com.dicoding.javafundamental.function;

public class InputFunction {
    public static void main(String[] args) {
        // memanggil fungsi
        hitungLuas(7, 6.5);
        hitungKeliling(7, 6.5);
    }

    public static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }

    public static void hitungKeliling( double panjang, double lebar) {
        double keliling;
        keliling = (2 * panjang) + (2 * lebar);
        System.out.println(keliling);
    }
}
