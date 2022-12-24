class Player
{
  String name;
  double health;
  int level;
  
  //object member
  Weapon weapon;
  Armor armor;
  
  Player(String name, double health)
  {
    this.name=name;
    this.health=health;
  }
  void attack(Player opponent)
  {
    double attackPower=this.weapon.attackPower;
    System.out.println(this.name+" is attacking "+ opponent.name + " with power "+ attackPower);
    opponent.defense(attackPower);
  }
  void defense(double attackPower)
  {
    //akan mengambil damage
    double damage;
    if(this.armor.defensePower<attackPower)
    {
      damage = attackPower-this.armor.defensePower;
    }else{
      damage=0;
    }
    this.health-=damage;
    System.out.println(this.name + " got damaged " + damage);
  }
  void equipWeapon(Weapon weapon)
  {
    this.weapon=weapon;
  }
  void equipArmor(Armor armor)
  {
    this.armor=armor;
  }
  void display()
  {
    System.out.println("\nName : " + this.name);
    System.out.println("Health : " + this.health + "hp");
    this.weapon.display();
    this.armor.display();
  }
}

class Weapon
{
  double attackPower;
  String name;
  Weapon(String name, double attackPower)
  {
    this.name=name;
    this.attackPower=attackPower;
  }
  void display()
  {
    System.out.println("Weapon: "+ this.name + " , Attack Power: "+ this.attackPower);
  }

}

class Armor
{
  double defensePower;
  String name;
  Armor(String name, double defensePower)
  {
    this.name=name;
    this.defensePower=defensePower;
  }
  void display()
  {
    System.out.println("Armor: "+ this.name + " , Defense Power: "+this.defensePower);
  }

}

public class Main 
{

  public static void main(String[]args)
  {
    //membuat object player
    Player player1=new Player("Noem",100);
    Player player2=new Player("Ret", 150);
    //membuat object weapon
    Weapon sword=new Weapon("Sword", 25);
    Weapon arrow=new Weapon("Arrow", 15);
    //membuat oject armor
    Armor ironSuit=new Armor("IronSuit", 10);
    Armor bladeArmor=new Armor("BladeArmor", 5);
    //Player 1
    player1.equipWeapon(sword);
    player1.equipArmor(ironSuit);
    player1.display();
    //Player 2
    player2.equipWeapon(arrow);
    player2.equipArmor(bladeArmor);
    player2.display();   
    
    System.out.println("\nPertempuran");
    System.out.println("\nEpisode-1\n");
    player1.attack(player2);
    player1.display();
    player2.display();
    System.out.println("\nEpisode-2\n");
    player2.attack(player1);
    player1.display();
    player2.display();

  }
}
