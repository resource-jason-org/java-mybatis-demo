package com.springriver.example.mybatis.util;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;


public class ConnectionFactory {
	private static SqlSessionFactory sqlMapper;
	private static Reader reader; 

	static{
		try{
			reader	  = Resources.getResourceAsReader("database-config.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader,getDatabaseProperties());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlMapper;
	}
	
	private static Properties getDatabaseProperties(){
		Resource resource = new ClassPathResource("database.properties");
		Properties databaseProperties = null;
		try {
			databaseProperties = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return databaseProperties;
	}
}
