package com.springboot.learnspringjpaandhibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{
	
//	CourseRepository courseRepo;
	CourseRepositoryJpa courseRepo;
	
	public CourseJpaCommandLineRunner(CourseRepositoryJpa courseRepo)
	{
		this.courseRepo = courseRepo;
	}

	@Override
	public void run(String... args) throws Exception {
//		courseRepo.save(new Course(1 , "nodejs" ,  "nishant"));
//		courseRepo.save(new Course(2 , "springboot" , "nishant"));
//		System.out.println(courseRepo.findById((long)2));
//		courseRepo.deleteById((long)2);
//		System.out.println(courseRepo.findAll().size());
		
		courseRepo.insert(new Course(1 , "nodejs" , "nishant"));
		courseRepo.insert(new Course(2 , "springboot" ,"nishant" ));
		System.out.println(courseRepo.findById((long)1));
		courseRepo.deleteById((int)2);
		
	}

}
