package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcApp01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(SpringJdbcApp01Application.class, args);
		BooksService bean = cxt.getBean(BooksService.class);
		bean.m1();
	}

}
