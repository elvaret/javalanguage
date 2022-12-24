package tutorial;
public class Main {
    public static void main(String[] args){
        Hero hero1 = new Hero("Noem");
        HeroStrength hero2 = new HeroStrength("Ret");
        hero1.display();
        hero2.display();

        //Polymorphic
        Hero hero3 = new HeroAgility("Noim");
        hero3.display();

        HeroIntel hero4 = new HeroIntel("Root");
        hero4.display();
        hero4.showoff();

        //Tidak bisa (is-a)
        // HeroIntel hero5 = new Hero("Mamang");
        // hero5.display(); 
        
        //Array List 
        Hero[]kumpulanhero = new Hero[4];
        kumpulanhero[0] = hero1;
        kumpulanhero[1] = hero2;
        kumpulanhero[2] = hero3;
        kumpulanhero[3] = hero4; //casting

        kumpulanhero[0].display();
        kumpulanhero[1].display();
        kumpulanhero[2].display();
        kumpulanhero[3].display();

        
        //Method calls 
        //kumpulanHero[3].showoff(); -->ini tidak bisa
        hero4.showoff();

        //aplikasi
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);

    }
}
