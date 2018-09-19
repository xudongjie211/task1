package com.imooc.mytask1.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.imooc.mytask1.pojo.Student;
import com.imooc.mytask1.service.ServiceImpl;

public class Startcrud {
	
	public static void main(String[] args){
		Logger log = Logger.getLogger("Startcrud.class");//java自带日志输出
		ServiceImpl simpl=new ServiceImpl();
		long time = System.currentTimeMillis();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		//添加记录，这边只添加5项做参考
//		Student stu=new Student();
//		stu.setQq("1131900758");
//		stu.setName("许东杰");
//		stu.setJob("java");
//		stu.setCreate_at(time);
//		stu.setUpdate_at(time);
//		//simpl.add(stu);
//		System.out.println(simpl.add(stu));
		
		
		//删除id匹配的记录
//		simpl.delete(1);
		
		
		
		//根据ID选择学生
//		String zfc=simpl.selectOne(78343).toString();
//		if(zfc!=null){
//			System.out.println(zfc);
//		}
		
		
		
		 //update
//		Student stu=new Student();
//		stu.setId(3);
//		stu.setQq("1132344");
//		stu.setName("张三");
//		stu.setJob("web");
//		stu.setUpdate_at(time);		
//		if(simpl.update(stu)){System.out.println("返回bollean成功");}
		
		//查询所有记录
//		
//		ArrayList<Student> list=new ArrayList<Student>();
//		list=simpl.select();
//		for(Student s:list){
//			System.out.println("创建时间："+sdf.format(s.getCreate_at())+"更新时间"+sdf.format(s.getUpdate_at())+"\r\n"+"详细信息"+s.toString()+"\r\n");	
//		}
		
		//查询记录数量
		//System.out.println(simpl.count());
		
		//删除所有记录，自增还原为1
//		simpl.deleteAll();
//		simpl.back1();
		
		
		
//		//模糊查询，名字中有哪个字的人
//		ArrayList<Student> list=simpl.selectLike("%东%");
//		if(list!=null&&list.size()>0){
//			for(Student s:list){
//				System.out.println("存在这样的人");
//				System.out.println("创建时间："+sdf.format(s.getCreate_at())+"更新时间"+sdf.format(s.getUpdate_at())+"\r\n"+"详细信息"+s.toString()+"\r\n");
//			}			
//		}else{System.out.println("不存在这样的人");}
//		
//		
//		
//		
		
		//批量插入1000条信息
		
		try{
		int i=0;
		Student stu=new Student();
		while(i<10000){	
			stu.setName("许东杰"+(i+1));
			stu.setJob("java");
			stu.setCreate_at(time);
			stu.setUpdate_at(time);
			simpl.add(stu);			
			i++;
			log.info("学生姓名"+stu.getName());
		}
		}catch(Exception e){
			e.printStackTrace();
			//加入異常后執行代碼
		}
		
		
	}
	
}
