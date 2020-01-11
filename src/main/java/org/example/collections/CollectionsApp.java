package org.example.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class CollectionsApp {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("collections.xml");

    }
    
    private Collection<String> set;
    private Map<Integer, String> namesByIds;
}
