package cn.enjoy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@SpringBootApplication
@EnableAutoConfiguration
public class App{

	@RequestMapping("/hello")
    public Object sayHello() {
        return "hello";
    }
	
	
	
    public static void main(String[] args) {
        //启动类
        //定制化
        SpringApplication.run(App.class, args);
    }
}
