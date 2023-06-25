package Lesson_1.Task_1;

public class Bottle extends Product
{
    private double volume;

    public Bottle(String name, double price, double volume) 
    {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + "; volume: " + volume + ", л";
    }
}
