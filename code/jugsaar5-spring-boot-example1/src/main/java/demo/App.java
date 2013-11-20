package demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {

	@RequestMapping("/")
	public String home() {
		return "Hallo Welt! " + new Date();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
