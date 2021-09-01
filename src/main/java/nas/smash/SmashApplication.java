package nas.smash;

import nas.smash.entity.Memo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmashApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmashApplication.class, args);
		SpringApplication.run(Memo.class, args);
	}
}
