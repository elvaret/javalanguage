
class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }void display(){
        System.out.println("Nama: "+ this.judul);
        System.out.println("Penulis: " + this.penulis);
    }
}
public class Main
{
    public static void main(String[] args) {
        Buku buku1=new Buku("Bunga dan Burung", "Joko Pinorobo");
        buku1.display();
    }
}