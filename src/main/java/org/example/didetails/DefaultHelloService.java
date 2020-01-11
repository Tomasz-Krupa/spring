package org.example.didetails;

public class DefaultHelloService implements HelloService {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
