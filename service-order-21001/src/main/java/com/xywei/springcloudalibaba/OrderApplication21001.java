package com.xywei.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author future
 * @DateTime 2021/3/13 11:14
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication21001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication21001.class, args);
    }
}
