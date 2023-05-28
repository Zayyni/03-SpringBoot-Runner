package com.zayyni.SpringBootRunners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class CacheCommandLineRunner implements CommandLineRunner {

    public CacheCommandLineRunner() {
        System.out.println("*****CacheCmdRunner::Constructor*****");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CCR:: run() method called");
    }
}
