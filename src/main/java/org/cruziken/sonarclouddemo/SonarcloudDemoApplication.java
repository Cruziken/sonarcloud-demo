package org.cruziken.sonarclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarcloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarcloudDemoApplication.class, args);
		System.out.print("We here now right so lets see what changes pop up");
	}
}
