package org.example.didetails;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task7_8 {

//    task7 - try with resources, bo trzeba zamknąć
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("didetails.xml")) {
            String name = c.getBean(String.class, "name");
            System.out.println(name);
            //task 8
            String hello = c.getBean("hello", DefaultHelloService.class).hello(name);
            System.out.println(hello);

        }


    }



}
