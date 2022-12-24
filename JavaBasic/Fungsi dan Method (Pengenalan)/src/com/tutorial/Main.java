package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        // y = (x+ 2) * x
        Scanner userInput;
        int y, x;
        userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai x = ");
        x = userInput.nextInt();
        y = hitung(x);
        System.out.println("maka y = " + y);
        System.out.println("y = f(x)");
        System.out.println("f(x) = (x+2)*x");

    }
    public static int hitung ( int input){
        int hasil;
        hasil = (input + 2) * input;
        return hasil;
    }
}
