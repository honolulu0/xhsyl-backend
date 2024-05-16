package com.weid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author weid
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WeidApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(WeidApplication.class, args);
        System.out.println("系统启动成功");
    }
}
