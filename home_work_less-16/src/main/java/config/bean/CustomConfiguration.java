package config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.StudentDaoImpl;
import model.Student;

@Configuration
public class CustomConfiguration {

	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Vasyl");
		student.setAge(29);
		
		return student;
	}
	
	@Bean(name = "studentDaoImpl")
	public StudentDaoImpl getStudentDaoImpl() {
		return new StudentDaoImpl();
	}
}
