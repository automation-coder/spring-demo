package com.demo.springdemo.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.util.Assert;

public class TestController {

    @Mock
    static Controller controller;

    @Before
    public void before() {
        controller = Mockito.mock(Controller.class);
        Mockito.when(controller.getData()).thenReturn(new String("TestData"));
    }

    @Test
    public void testGetData() {
        Assert.hasText(controller.getData(), "TestData");
    }
}
