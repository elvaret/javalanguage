package com.tutorial;

public class Main {
    public static void main(String[] args) {

        //unary = operasi angka yang dilakukan pada satu variabel

        //unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n", angka, -angka);

        // increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        // decrement
        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);
        int b = 5;
        System.out.printf("nilai hasil dari postfiks menjadi = %d \n", b++);
        System.out.printf("nilai hasil dari postfiks menjadi %d \n", b);

        //unary boolean dengan !untuk negasi

        boolean Collicia = true;
        System.out.println("nilai booolean = " + Collicia);
        System.out.println("nilai boolean = " + !Collicia);
    }
}
