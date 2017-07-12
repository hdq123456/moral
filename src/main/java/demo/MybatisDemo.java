package demo;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisDemo {
	
	private static SqlSession session = null;
	
	//从XML创建SqlSessionFactory实例;
	public static SqlSessionFactory getSqlSessionFactory() throws IOException{
		SqlSessionFactory sqlsessionfactory = null;
		try {
			String resource = "classpath:spring-mybatis.xml";
			Reader asReader = Resources.getResourceAsReader(resource);
			sqlsessionfactory = new SqlSessionFactoryBuilder().build(asReader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		return sqlsessionfactory;
	}
	
	//获取SqlSession;
	public static SqlSession getSqlSession() throws IOException{
		 session = getSqlSessionFactory().openSession();
		 return session;
	}
	
	public static void closeSqlSession() throws IOException{
		session.close();
	}
	
	
}
