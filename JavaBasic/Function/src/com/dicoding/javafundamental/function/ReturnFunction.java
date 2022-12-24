package com.dicoding.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l); //memanggil fungsi
        System.out.println("Hasil luas adalah = " + hasil);
        double hasil1 = hitungKeliling(p, l); //memanggil fungsi
        System.out.println("Hasil keliling adalah = " + hasil1);
    }

    //fungsi dengan nilai balik
    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    //fungsi dengan nilai balik
    public static double hitungKeliling(double panjang, double lebar) {
        double keliling = (2 * panjang) + (2 * lebar);
        return keliling;
    }
}
