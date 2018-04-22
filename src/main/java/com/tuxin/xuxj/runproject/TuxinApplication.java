package com.tuxin.xuxj.runproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = {"com.tuxin.xuxj"}, exclude = {})
@MapperScan("com.tuxin.xuxj.dao")
@EnableTransactionManagement
public class TuxinApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuxinApplication.class, args);
	}
}
