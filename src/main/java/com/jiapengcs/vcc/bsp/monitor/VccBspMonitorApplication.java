package com.jiapengcs.vcc.bsp.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2018/11/14
 */
@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class VccBspMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(VccBspMonitorApplication.class, args);
    }
}
