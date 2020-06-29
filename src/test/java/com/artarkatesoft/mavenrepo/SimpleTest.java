package com.artarkatesoft.mavenrepo;

import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void someTest(){
        System.out.println("Running simple test");
        System.out.println(System.getenv("TEST_HOST"));
    }
}
