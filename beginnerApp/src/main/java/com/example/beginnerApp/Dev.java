package com.example.beginnerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Dev {
    @Autowired
    @Qualifier("desktop")
    private Computer computer;

    /*public Dev(Laptop laptop) {
        this.laptop = laptop;
    }*/

    /*@Autowired
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }*/

    public void build(){
        computer.compile();
        System.out.println("project is working");
    }
}
