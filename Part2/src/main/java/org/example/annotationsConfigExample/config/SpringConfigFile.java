package org.example.annotationsConfigExample.config;

import org.example.annotationsConfigExample.ClassicalMusic;
import org.example.annotationsConfigExample.RockMusic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan (basePackageClasses = {RockMusic.class, ClassicalMusic.class})
@Configuration
public class SpringConfigFile {
}
