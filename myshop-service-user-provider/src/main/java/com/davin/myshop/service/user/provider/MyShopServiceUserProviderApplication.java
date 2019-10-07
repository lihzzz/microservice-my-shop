package com.davin.myshop.service.user.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableHystrix
@EnableHystrixDashboard
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.davin.myshop")
@MapperScan(basePackages = "com.davin.myshop.commons.mapper")
public class MyShopServiceUserProviderApplication {


    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceUserProviderApplication.class,args);
        Main.main(args);
    }
}
