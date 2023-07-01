package Lesson_2.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Radio());

        ZooNoise zooNoise = new ZooNoise(animals);
        zooNoise.speakAll();
    }
}
