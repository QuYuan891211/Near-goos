package com.nmefc.neargoos;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.nmefc.neargoos.dao")
public class NearGoosApplication {

	public static void main(String[] args) {
		SpringApplication.run(NearGoosApplication.class, args);
	}

}
