package org.example.annotationsConfigExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    MusicPlayer musicPlayer;
    private long id;


    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer "
                +id + " Start " + musicPlayer.playMusic();
    }
}
