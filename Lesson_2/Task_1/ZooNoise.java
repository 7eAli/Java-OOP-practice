package Lesson_2.Task_1;

import java.util.List;

public class ZooNoise {
    private List<Speakable> noise_sources;

    public ZooNoise(List<Speakable> noise_sources) {
        this.noise_sources = noise_sources;
    }

    public void speakAll()
    {
        for (Speakable noise_source : noise_sources) {
            noise_source.speak();
        }
    }
}
