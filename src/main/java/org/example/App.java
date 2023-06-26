package org.example;

import org.example.config.MyConfig;
import org.example.entity.Communication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        System.out.println("Answer: " + communication.getAnswer());

    }
}
