package com.imooc.mytask1.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imooc.mytask1.dao.JdbcInterface;
import com.imooc.mytask1.pojo.Student;






@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JunitTest {
@Autowired
	private JdbcInterface jt;
	@Test
	public void testAdd() {
		long time = System.currentTimeMillis();
		
		try{
			Student stu=new Student();
			stu.setQq("1131900758");
			stu.setName("许东杰");
			stu.setJob("java");
			stu.setCreate_at(time);
			stu.setUpdate_at(time);
			jt.add(stu);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
/*
 * 
 * 
 * 方法类似main中的方法
	@Test
	public void testDelete() {
		
	}

	@Test
	public void testUpdate() {
		
	}

	@Test
	public void testSelectOne() {
	
	}

	@Test
	public void testSelect() {
	
	}

	@Test
	public void testSelectLike() {

	}

	@Test
	public void testCount() {

	}

	@Test
	public void testDeleteAll() {

	}
*/
}
