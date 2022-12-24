public class conditionSelection{

  public static void main(String[] args) {
  
      //nested if 
      int a=5;
      int b=8;
      if (a==5){
        if (b==10){
          System.out.println("a dan b sama dengan 5 dan 10");
        }else{
          System.out.println("a sama dengan 5 dan b tidak sama dengan 10");
        }
      }else{
        System.out.println("dimana a dan b tidak sama dengan 5 dan 10");
      }
  }
}