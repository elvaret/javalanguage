package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args){

        {
            // Menghitung nilai deret fibonacci ke-n dengan for
            System.out.println("Dengan for");
            int f_n, f_n_1, f_n_2, n;
            Scanner inputUser = new Scanner(System.in);
            System.out.print("mengambil nilai fibonacci ke - :");
            n = inputUser.nextInt();
            f_n_2 = 0;
            f_n_1 = 1;
            f_n = 1;

            for (int i = 1; i <= n; i++) {
                System.out.println("nilai ke-" + i + " adalah " + f_n);
                f_n = f_n_1 + f_n_2;
                f_n_2 = f_n_1;
                f_n_1 = f_n;
            }
            System.out.println("Dengan loop selesai");
        }
        System.out.println("\n");
        {
            //Menghitung nilai deret fibonacci ke-n dengan while
            System.out.println("Dengan while");
            int f_n, f_n_1, f_n_2, n;
            Scanner inputUser = new Scanner(System.in);
            System.out.print("mengambil nilai fibonacci ke - :");
            n = inputUser.nextInt();
            f_n_2 = 0;
            f_n_1 = 1;
            f_n = 1;

            int i = 1;
            while (i <= n) {
                System.out.println("nilai ke-" + i + " adalah " + f_n);
                f_n = f_n_1 + f_n_2;
                f_n_2 = f_n_1;
                f_n_1 = f_n;
                i++;
            }
            System.out.println("Dengan while selesai");
        }
        System.out.println("\n");
        {
            //Menghitung nilai deret fibonacci ke-n dengan do while
            System.out.println("Dengan do while");
            int f_n, f_n_1, f_n_2, n;
            Scanner inputUser = new Scanner(System.in);
            System.out.print("mengambil nilai fibonacci ke - :");
            n = inputUser.nextInt();
            f_n_2 = 0;
            f_n_1 = 1;
            f_n = 1;

            int i = 1;
            do {
                System.out.println("nilai ke-" + i + " adalah " + f_n);
                f_n = f_n_1 + f_n_2;
                f_n_2 = f_n_1;
                f_n_1 = f_n;
                i++;
            } while  (i <= n);
            System.out.println("Dengan do while selesai");

        }

    }
}
