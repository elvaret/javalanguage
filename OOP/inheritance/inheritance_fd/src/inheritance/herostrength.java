package inheritance;
// this.name akan mengakses atribut name kalau ada di kelas ini.
// jika tidak ada maka akan mengkases atribut name dari superclass.
// super.name akan selalu mengakses atribut superclass

//override method
class herostrength extends hero{
  String name="class strength";
  void display(){
    System.out.println("ini adalah: " + this.name);
    this.dummymethod();
  }
  void displaySuper(){
    System.out.println("ini adalah: " + super.name);
    super.dummymethod();
  }
  void dummymethod(){
    System.out.println("method ini ada di sub class");
  }

  // void display(){
  //   System.out.println("\nhero strength");
  //   System.out.println("hero name: "+ this.name);
  //   System.out.println("attack power: "+ this.attackpower);
  // }
}
