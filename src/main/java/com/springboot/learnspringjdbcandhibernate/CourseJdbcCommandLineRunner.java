package com.springboot.learnspringjdbcandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseRepository  courseRepo;
	@Override
	public void run(String... args) throws Exception {
		courseRepo.insert();
		courseRepo.dinsert(new Course(2 , "Springboot" ,"Nishant"));
		courseRepo.delete(1);
		courseRepo.upd(2 , "nodejs");
		Course course = courseRepo.findById((long)2);
		System.out.println(course);
	}

}
