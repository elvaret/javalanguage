package package2;

import package1.KelasA;

public class Main {
    public static void main(String[] args) {

        // Kode ini pasti akan mengalami kompilasi error

        KelasA kelasA = new KelasA();

        //System.out.println(kelasA.functionB());

        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);

        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
