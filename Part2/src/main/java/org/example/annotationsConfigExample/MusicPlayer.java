package org.example.annotationsConfigExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private  Music music1;
    private  Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    //    private String name;
//    private int volume;
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;

//    @Autowired
//    @Qualifier("classical Music")
//        public void setMusic(Music music) {
//        this.music = music;
//
//    }


    public String playMusic() {
        return "Playing " + music1.getSong()+ " and " + music2.getSong();

    }

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;

//    }
//    @Autowired
//    public MusicPlayer(RockMusic rockMusic) {
//        this.rockMusic = rockMusic;

//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;

//    }

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//

}
