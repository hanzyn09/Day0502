package com.the.mybatis;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisManager {
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory getInstance() {
		if(sqlSessionFactory == null)
			new MybatisManager();
		return sqlSessionFactory;
	}
	
	/*
	 * static { System.out.println("static 영역에서 초기화");
	 * String resource = "/com/the/mybatis/mybatis-config.xml"; 
	 * 
	 * InputStream inputStream = null;
	 * 
	 * try { 
	 *  inputStream = Resources.getResourceAsStream(resource); 
	 * } catch (IOException e) { 
	 *   e.printStackTrace(); }
	 * 
	 * sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); 
	 * }
	 */
	
	private MybatisManager() {
		System.out.println("생성자 호출");
		
		String resource = "/com/the/mybatis/mybatis-config.xml";
		InputStream inputStream = null;
		
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); 
	}
	
	
}
