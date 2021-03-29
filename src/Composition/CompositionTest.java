package Composition;

public class CompositionTest
{
    public static void main(String[] args) {
        Case C1 = new Case("PC-10","Acer","220V",new Dimensions(12,5,1));
        Monitor M1 = new Monitor("ASUS10","ASUS",new Resolution(768,1024),22);
        MotherBoard MB1 = new MotherBoard("SZX","Intel",4,6);
        PC P1 = new PC(C1,M1,MB1);
//      P1.getThemonitor().drawPixel(100,200);
//      P1.getTheCase().pressPowerButton();

        P1.powerUp();

      }
}
