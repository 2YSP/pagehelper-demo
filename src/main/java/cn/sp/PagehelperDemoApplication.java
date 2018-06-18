package cn.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"cn.sp.mapper"})
@SpringBootApplication
public class PagehelperDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagehelperDemoApplication.class, args);
	}
}
