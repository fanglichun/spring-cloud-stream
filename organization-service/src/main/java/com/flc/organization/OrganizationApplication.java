package com.flc.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName LicenseApplication
 * @Description
 * @Author fanglichun
 * @Date 2019-11-17 10:54
 * @Version 1.0
 **/
@SpringBootApplication(scanBasePackages = {"com.flc.organization"})
public class OrganizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizationApplication.class);
    }
}
