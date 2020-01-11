package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTask4 {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("random.xml");


        //po refactor

        MyRandom myRandom2= (MyRandom) applicationContext.getBean("myRandom2");     //biorę beana bez klasy (po nazwie), ale rzutuję na właściwą klasę

        System.out.println("Wypisujemy:");
        System.out.println(applicationContext.getBean("myRandom1", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom2", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom3", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("random", MyRandom.class).getValue()); //aliasowany


        System.out.println(applicationContext.getBean("now")); //definiujemy w .xml met. wytwórczą, gdy klasa nie ma publicznego konstruktora bezparametrowego
        Thread.sleep(1000);
        System.out.println(applicationContext.getBean("now"));
        Thread.sleep(1000);
        System.out.println(applicationContext.getBean("now"));      //cały czas ten sam czas
        Thread.sleep(1000);




    }
}
