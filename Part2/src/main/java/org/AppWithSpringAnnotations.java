package org;

import org.example.annotationsConfigExample.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppWithSpringAnnotations {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.annotationsConfigExample");
//
//        Music musicBean = context.getBean( "rockMusic" ,Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer);

//        MusicPlayer playerBean = context.getBean( MusicPlayer.class);
//        playerBean.playMusic();

        Computer bean = context.getBean(Computer.class);

        System.out.println(bean);

    }
}
