package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTask10 {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("random.xml");

        System.out.println(applicationContext.getBean("myRandom4", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom4", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom4", MyRandom.class).getValue());






    }
}
