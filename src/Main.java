public class Main
{
  public static void main(String[] args)
  {
//      Car porsche = new Car(4,6,"FORD","XST","Red");
//      System.out.println(porsche.getColor());
//      System.out.println(porsche.getDoors());
//      System.out.println(porsche.getEngine());
//      System.out.println(porsche.getModel());
//      System.out.println(porsche.getWheels());
//
//      Car ferrari = new Car("Ford","XDR");
//      System.out.println(ferrari.getColor());
//      System.out.println(ferrari.getDoors());
//      System.out.println(ferrari.getEngine());
//      System.out.println(ferrari.getModel());
//      System.out.println(ferrari.getWheels());

      //**************************************************************************************************************
      Animal A1 = new Animal("Chinnu",1,1,8,16);
      A1.eat();
      System.out.println(A1.getName());

      dog D1 = new dog("Yorkie",1,17,2,4,1,34);
      D1.eat();
      System.out.println(D1.getName());
      D1.move(5);
  }
}
