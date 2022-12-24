package inheritance;

//parent class, base class
class hero{
  String name="class hero";
  void display(){
    System.out.println("hero name: " + this.name);
  }
  void dummymethod(){
    System.out.println("method ini ada di superclass");
  }
}