package org.thanh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableScheduling
@EnableZipkinServer
public class Application {
	// this is new line
	// this is new new line

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
