package com.nithin.sellmycar;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    public void code() {
        System.out.println("calling from desktop");
    }

}
