package Lesson_1.Task_1;

public class Product 
{
    private int id;
    private String name;
    private double price;

    Product(String name, double price)
    {        
        this.name = name;
        this.price = price;
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id + " " + "; name: " + name + "; price: " + price + " p.";
    }
}
