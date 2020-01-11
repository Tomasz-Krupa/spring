package org.example.didetails;

public class DefaultHelloService implements HelloService {

    String name;

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
