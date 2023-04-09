package com.springboot.learnspringjpaandhibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Course {

	  @Id
	  private long id;
	  @Column(nullable = false)
	  String name;
	  @Column(nullable = false)
	  String author_name;
	
}
