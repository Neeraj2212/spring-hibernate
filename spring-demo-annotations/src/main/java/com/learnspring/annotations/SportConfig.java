package com.learnspring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnspring.annotations.beans.Coach;
import com.learnspring.annotations.beans.FortuneService;
import com.learnspring.annotations.beans.SadFortuneService;
import com.learnspring.annotations.beans.SwimCoach;

@Configuration
// @ComponentScan("com.learnspring.annotations") // Not needed while manually
// defining beans manually
public class SportConfig {

    // Method name is the bean id
    // Define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // Define bean for swim coach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
