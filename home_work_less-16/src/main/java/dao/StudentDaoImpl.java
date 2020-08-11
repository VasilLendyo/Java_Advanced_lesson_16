package dao;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDaoImpl implements StudentDao<Student>{

	public List<Student> students = new ArrayList<>();
	
	@Override
	public Student create(Student student) {
		students.add(student);
		return student;
	}

	@Override
	public Student read(Integer id) {
		return students.get(id);
	}

	@Override
	public Student update(Integer id, String name, Integer age) {
		Student student = null;
		students.get(id).setName(name);
		students.get(id).setAge(age);
		return student;
	}

	@Override
	public void delete(int id) {
		
		students.remove(id);
	}

	@Override
	public List<Student> readAll() {
		return students;
	}

}
