package airport.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {

		JavaConn conn = new JavaConn();
		conn.connect();
		SpringApplication.run(BackendApplication.class, args);
	}

}
