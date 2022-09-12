package org.example.annotationsConfigExample;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic () {
        return new ClassicalMusic();
    }

    public void doMyInit () {
        System.out.println("initialization method");
    }

    public void doMyDestroy () {
        System.out.println("destruction method");
    }



    @Override
    public String getSong() {
        return "Classical Music";
    }
}
