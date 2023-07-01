package Lesson_2.Task_2;

public class Uber extends Taxi{
    @Override
    public void drive(String address) {
        System.out.println("Убер такси уже в пути");
    }
}
