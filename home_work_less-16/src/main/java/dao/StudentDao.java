package dao;

import java.util.List;

import model.Student;

public interface StudentDao <T>{

	T create(T t);
	
	T read(Integer id);
	
	List<T> readAll();

	Student update(Integer id, String name, Integer age);

	void delete(int id);
}
