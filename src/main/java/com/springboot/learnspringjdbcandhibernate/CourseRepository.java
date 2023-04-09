package com.springboot.learnspringjdbcandhibernate;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	 private JdbcTemplate springJdbcTemplate;
	 
	 public CourseRepository(JdbcTemplate springJdbcTemplate)
	 {
		 this.springJdbcTemplate = springJdbcTemplate;
	 }
	 
	 private static String INSERT_QUERY =
			"""
	 		insert into course(id , name , author)
	 		values(1 , 'Learn springboot' , 'Nishant')
	 		""";
	 
	 private static String DYNAMIC_INSERT = 
			 """
			  insert into course(id , name , author)
			  values(? , ? , ?)
			 """;
	 
	 private static String DELETE_QUERY = 
			 """
			  delete from course where id = ?	
			 """;
	 
	 private static String UPDATE_QUERY = 
			 """
			  update course	set name = ? where id = ?	
			 """;
	 
	 private static String SELECT_QUERY = 
			 """
			 	select * from course
			 	where id = ?	
			 """;
	 
	 public void insert()
	 {
		 springJdbcTemplate.update(INSERT_QUERY);
	 }
	 
	 public void dinsert(Course course)
	 {
		 springJdbcTemplate.update(DYNAMIC_INSERT , course.getId() , course.getName() , course.getAuthor_name());
	 }
	 
	 public void delete(long id)
	 {
		 springJdbcTemplate.update(DELETE_QUERY , id);
	 }
	 
	 public void upd(int id , String name)
	 {
		 springJdbcTemplate.update(UPDATE_QUERY , name , 2);
	 }
	 
	 public Course findById(long id)
	 {
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class) , id);
	 }
}
