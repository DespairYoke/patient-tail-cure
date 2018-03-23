package com.zwd.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zwd
 * @date 2018/3/22 15:38
 * @Email lovejavazwd@gmail.com
 */
@SpringBootApplication(scanBasePackages = {"com.zwd.app"})
@MapperScan("com.zwd.app.mapper")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
