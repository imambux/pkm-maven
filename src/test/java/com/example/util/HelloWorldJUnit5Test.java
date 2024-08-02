package com.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldJUnit5Test {

    @Test
    void getHelloWorld() {
        assertEquals(new HelloWorld().getHelloWorld(), "Hello World!");
    }

}