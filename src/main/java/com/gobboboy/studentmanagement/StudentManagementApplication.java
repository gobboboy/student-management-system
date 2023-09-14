package com.gobboboy.studentmanagement;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gobboboy.studentmanagement.entity.Student;
import com.gobboboy.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/* 
		Student student1 = new Student("Marcos", "Gobbo", "marcos@gmail.com");
		Student student2 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
		Student student3 = new Student("Nelson", "Casado", "nelson@gmail.com");
		Student student4 = new Student("João", "Silva", "joao@gmail.com");
		
		studentRepository.saveAll(Arrays.asList(student1, student2, student3, student4));
		*/
	}

}
