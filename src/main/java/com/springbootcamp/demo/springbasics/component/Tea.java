package com.springbootcamp.demo.springbasics.component;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Primary
@Component
public class Tea implements HotDrink{

    public void prepareHotDrink() {
        System.out.println("Preparing Tea");
    }

}
