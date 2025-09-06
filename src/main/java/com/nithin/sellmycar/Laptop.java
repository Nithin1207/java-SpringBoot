package com.nithin.sellmycar;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void code() {
        System.out.println("right now i am in laptop class");
    }

}
