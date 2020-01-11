package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTask3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("random.xml");

        MyRandom myRandom= applicationContext.getBean("myRandom1", MyRandom.class);      //tworzy instancję
        System.out.println(myRandom.getValue());

        MyRandom myRandomBis= applicationContext.getBean("myRandom1", MyRandom.class);       //ten sam bean - ten sam wynik
        System.out.println(myRandomBis.getValue());

        MyRandom myRandom2= applicationContext.getBean("myRandom2", MyRandom.class);       //każdy bean to osobny obiekt- losuje inną liczbę
        System.out.println(myRandom2.getValue());

        MyRandom myRandom3= applicationContext.getBean("myRandom3", MyRandom.class);
        System.out.println(myRandom3.getValue());



    }
}
