package Lesson_1.Task_1;

public class Main 
{
    public static void main(String[] args) 
    {
        VendingMachine vendingMachine = new VendingMachine(0);
        Product product1 = new Product("Bread", 20);
        Product product2 = new Product("Milk", 60);
        Product product3 = new Product("Fish", 400);
        Product product4 = new Bottle("Coca-cola", 150, 2);
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);
        System.out.println(vendingMachine.getProductsInfo());        
    }    
}
