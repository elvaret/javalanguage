package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

     //Switch Case

     String input;
     Scanner inputUser = new Scanner(System.in);
        System.out.print("panggil nama : ");
        input = inputUser.next();
        //Ekspresinya berupa satuan (int, long, byte, short, string,enum)
        switch (input) {
            case "Jeli":
                System.out.println("Saya Jeli dan hadir Pak !!!");
                break;
            case "Jelo":
                System.out.println("Saya Jelo dan hadir pak!!!");
                break;
            default:
                System.out.println(input + " tidak hadir pak !!!");

        }
        System.out.println("Program selesai");


        String input1;
        Scanner inputUser1 = new Scanner(System.in);
        System.out.print("panggil nama : ");
        input1 = inputUser1.next();
        //Ekspresinya berupa satuan (int, long, byte, short, string,enum)
        switch (input1) {
            case "Jeli" -> System.out.println("Saya Jeli dan hadir Pak !!!");
            case "Jelo" -> System.out.println("Saya Jelo dan hadir pak!!!");
            default -> System.out.println(input1 + " tidak hadir pak !!!");

        }
        System.out.println("Program selesai");
    }
}
