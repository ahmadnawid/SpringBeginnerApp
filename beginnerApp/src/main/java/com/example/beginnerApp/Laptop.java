package com.example.beginnerApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Test with 404");
    }
}
