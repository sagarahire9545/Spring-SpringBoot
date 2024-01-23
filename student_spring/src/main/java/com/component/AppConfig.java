package com.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.component.Actor","com.component.Movie"})
public class AppConfig {

}
