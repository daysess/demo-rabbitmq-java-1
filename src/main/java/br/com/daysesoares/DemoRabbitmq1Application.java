package br.com.daysesoares;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRabbitmq1Application implements CommandLineRunner{

	@Autowired
	private ConfigurationProperties config;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoRabbitmq1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		System.out.println(config.getLeiturafila());
		Recv r = new Recv();
		r.connectionRabbitMq(config.getLeiturafila());
		
	}

}
