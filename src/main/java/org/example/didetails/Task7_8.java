package org.example.didetails;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task7_8 {

//    task7 - try with resources, bo trzeba zamknąć
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("didetails.xml")) {
            String name = c.getBean(String.class, "name");
            System.out.println(name);
        }


    }



}
