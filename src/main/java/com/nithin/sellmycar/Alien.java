package com.nithin.sellmycar;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Alien {
    @Value("nithin kumar")
    public String name;
    @Value("24")
    public int age;
    @Autowired
    // @Qualifier("laptop")
    Computer com; // new Laptop();

    // public Computer getCom() {
    //     return com;
    // }

    // public void setCom(Computer com) {
    //     this.com = com;
    // }

    public void alien() {
        System.out.println("Alien class is called");
        com.code();

    }

}
