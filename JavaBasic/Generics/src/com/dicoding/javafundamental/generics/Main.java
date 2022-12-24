package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List lo = new ArrayList(); // List tanpa type-parameter
        lo.add("lo - String1"); // lo menampung objek String
        lo.add(new Planet("Mercury", 0.06)); // lo menampung objek planet

        List<Planet> Ip = new ArrayList(); // List dengan type-parameter
        Ip.add(new Planet("mercury", 0.06)); // Ip menampung objek dari Planet
        Ip.add("Ip - String 1"); // baris ini compile-error, Ip tidak diijinkan menampung objek String
    }
}
