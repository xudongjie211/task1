package com.imooc.mytask1.dao;

import java.util.ArrayList;

import com.imooc.mytask1.pojo.Student;

public interface JdbcInterface {
	//增删改的返回值可以使void,boolean（操作是否成功）,int（受影响行数）
	public long add(Student u);
	public boolean delete(int id);
	public boolean update(Student u);
	public Student selectOne(int id);
	public ArrayList<Student> select();//总表查询
	public ArrayList<Student> selectLike(String name);//模糊查询
	public int count();//记录条数
	public boolean deleteAll();
	public boolean back1();
	
	/*用注释方法把sql语句添加到mapper配置文件中，对应的接口不支持重载
	 * 编译时会生成实现类
	 * 
	 * 
	 * 其他层要使用用@Autowired 自动注入
	 * 
	 * 
	 * 2、写接口spring会自动扫描
	 * @Repository
		@Mapper
	 * public interface JdbcInterface {
	 * 	
		  @Insert   以insert方法实例
		({"insert into ", form1, "("qq,name,job,create_at,update_at ") Values (#{qq},#{name},#{job},#{create_at},#{update_at})"})
    	int add(Student u);//方法写下面。
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * */
	
	
	
}
