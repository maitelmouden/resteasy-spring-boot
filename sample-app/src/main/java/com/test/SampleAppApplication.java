package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * SpringBoot entry point application
 *
 * Created by facarvalho on 12/7/15.
 */
@SpringBootApplication
public class SampleAppApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SampleAppApplication.class, args);
    }
}
