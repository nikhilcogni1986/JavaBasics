package Composition;

public class MotherBoard
{
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }
}
