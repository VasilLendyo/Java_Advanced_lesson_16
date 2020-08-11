package config.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dao.StudentDaoImpl;
import model.Student;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		Student student = (Student) ctx.getBean("student");
		
		StudentDaoImpl dao = (StudentDaoImpl) ctx.getBean("studentDaoImpl");
		
		dao.create(student);
		System.out.println(dao.students);
		
		Student read = dao.read(0);
		System.out.println(read);
		
		dao.update(0, "Petro", 20);
		System.out.println(dao.students);
		
		dao.delete(0);
		System.out.println(dao.students);
	}
}
