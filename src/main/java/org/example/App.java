package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml", "random.xml");
        System.out.println(applicationContext);

        CartService cartService = applicationContext.getBean("cartService", CartService.class);        //tu spring wiąże przez typy
        System.out.println(cartService);
        Object cartService2 = applicationContext.getBean("oneItemCartService" );        //trzeba rzutoweać, jeśli nie podamy klasy lub dać klasę Object
        System.out.println(cartService2);
        Object cartService3 = applicationContext.getBean("cartService3" );        //spod aliasu
        System.out.println(cartService2);

        Map<String, CartService> beans = applicationContext.getBeansOfType(CartService.class);
        System.out.println(beans);

        CartService cartService4 = applicationContext.getBean("anotherCartService", CartService.class);        //tu spring wiąże przez typy
        System.out.println(cartService4);



    }
}
