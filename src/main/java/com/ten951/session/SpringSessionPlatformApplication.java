package com.ten951.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class SpringSessionPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSessionPlatformApplication.class, args);
    }

}
