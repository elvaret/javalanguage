
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        // Uji voba
        // program untuk menjumlahkan angka dengan rentang tertentu

        int nilaiAwal, nilaiAkhir, total;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai Awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan nilai Akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;
        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

    }
}

