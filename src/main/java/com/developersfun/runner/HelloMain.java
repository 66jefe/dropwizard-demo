package com.developersfun.runner;

import com.developersfun.config.HelloConfig;
import com.developersfun.resources.HelloResources;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class HelloMain extends Application <HelloConfig>{
    public static void main(String[] args) throws Exception {
        new HelloMain().run(args);
    }

    @Override
    public void run(HelloConfig helloConfig, Environment environment) throws Exception {
        System.out.println("Backend started!");
        environment.jersey().register(new HelloResources());
    }
}
