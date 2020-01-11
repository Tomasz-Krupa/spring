package org.example.task5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cars.xml");
        System.out.println(applicationContext);

        Car car1 = applicationContext.getBean("car1", Car.class);
        System.out.println(car1);

        System.out.println(applicationContext.getBean("car2", Car.class));
        System.out.println(applicationContext.getBean("car3", Car.class));
        System.out.println((Car)applicationContext.getBean("car4"));                //castujemy na klasę Car
        System.out.println(applicationContext.getBean("car0"));                // nie używamy konstruktora - mamy null i 0

        System.out.println(applicationContext.getBean("setterInjectedCar") +" - setter injected");





    }
}
