package org;

import org.example.xmlConfigExample.ClassicalMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppWithXmlConfig {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

//
//        TestBeanXmlAnnotaited testBean = context.getBean("testBean", TestBeanXmlAnnotaited.class);
//        String name = testBean.getName();
//        System.out.println(name);
//        int beanDefinitionCount = context.getBeanDefinitionCount();
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (int i = 0; beanDefinitionNames.length > i; i++) {
//            System.out.println(beanDefinitionNames);
//
//        }

        //TODO without DEPENDENCY INJECTION (DI)
//        Music music = context.getBean("music", Music.class);
//        MusicPlayer musciPlayer = new MusicPlayer(music);

        //TODO with DEPENDENCY INJECTION (DI) on XML config file
//        MusicPlayer playerBean = context.getBean("playerBean", MusicPlayer.class);
//        playerBean.playMusic();
//        context.close();

        //TODO with DEPENDENCY INJECTION (DI) on XML config file
//        MusicPlayer playerBean2 = context.getBean("playerBean2", MusicPlayer.class);
//        playerBean2.playMusic();
//        System.out.println(playerBean2.getVolume());
//        System.out.println(playerBean2.getName());
//        context.close();


        //TODO with "Init-method" and "destroy-method" on XML config file
        ClassicalMusic music = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic music2 = context.getBean("musicBean", ClassicalMusic.class);

        String song = music.getSong();
        System.out.println(song);

        System.out.println(music);
        System.out.println(music2);

        context.close();

    }
}
