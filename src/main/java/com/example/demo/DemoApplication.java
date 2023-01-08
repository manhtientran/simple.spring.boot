package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello world!";
	}

	@GetMapping("/list")
	public List<Student> list() {
		return List.of(
				new Student(
						1L,
						"Maria",
						"maria.goldberg@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21
				)
		);
	}
}
