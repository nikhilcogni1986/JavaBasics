package Composition;

public class PC
{
    private Case theCase;
    private Monitor themonitor;
    private MotherBoard themotherboard;

    public PC(Case theCase, Monitor themonitor, MotherBoard themotherboard) {
        this.theCase = theCase;
        this.themonitor = themonitor;
        this.themotherboard = themotherboard;
    }

    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        themonitor.drawPixel(100,200);
    }
}
