package com.dicoding.javafundamental.obyek;

public class Main {
    public static void main(String[] args) {
        Hewan Anjing = new Hewan("Anjing");
        Hewan Kucing = new Hewan("Kucing");
        Hewan Ikan = new Hewan("Ikan");

        Anjing.beratHewan(20);
        Anjing.jumlahKakiHewan(4);
        Anjing.cetakHewan();

        Kucing.beratHewan(6);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();

        Ikan.beratHewan(100);
        Ikan.jumlahKakiHewan(0);
        Ikan.cetakHewan();
    }
}
