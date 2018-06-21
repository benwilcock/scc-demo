package com.example;


import com.example.sccdemo.HelloService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public abstract class MvcBase {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new HelloService());
    }

}