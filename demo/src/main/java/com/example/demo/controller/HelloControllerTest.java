package com.example.demo.controller;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    @Test
    public void testSayHello() {
        HelloController controller = new HelloController();
        String response = controller.sayHello().getBody();
        assertEquals("¡Hola, arauca que calor!", response);
    }
}

