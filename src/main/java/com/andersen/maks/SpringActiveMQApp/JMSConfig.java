package com.andersen.maks.SpringActiveMQApp;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;
import java.awt.*;

@Configuration
@EnableJms
public class JMSConfig {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("simple-jms-queue");
    }
}