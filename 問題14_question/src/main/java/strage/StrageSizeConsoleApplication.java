package strage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StrageSizeConsoleApplication {
//ｋｋｋ
	public static void main(String[] args) {//asa
		ConfigurableApplicationContext context = SpringApplication.run(StrageSizeConsoleApplication.class, args);
		StrageSizeConsoleApplication application = context.getBean(StrageSizeConsoleApplication.class);
		application.run();
	}
//aaa
	public void run() {


	}
}
