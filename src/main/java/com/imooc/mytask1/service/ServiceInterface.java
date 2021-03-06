package com.imooc.mytask1.service;

import java.util.ArrayList;

import com.imooc.mytask1.pojo.Student;

public interface ServiceInterface {
	public long add(Student u);
	public boolean delete(int id);
	public boolean update(Student u);
	public Student selectOne(int id);
	public ArrayList<Student> select();
	public ArrayList<Student> selectLike(String name);
	public int count();
	public boolean deleteAll();
	public boolean back1();
	
}
