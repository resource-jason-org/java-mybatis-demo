package com.springriver.example.mybatis.util;

import org.apache.ibatis.session.SqlSession;

import com.springriver.example.mybatis.bean.Users;
import com.springriver.example.mybatis.mapper.UsersMapper;

public class UsersManager {
	public static Users selectUserById(int id) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory()
				.openSession();
		try {
			UsersMapper userMapper = sqlSession
					.getMapper(UsersMapper.class);
			return userMapper.selectUserById(id);
		} finally {
			sqlSession.close();
		}
	}
	
	public static void insertUser(Users users){
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory()
				.openSession();
		try {
			
			UsersMapper userMapper = sqlSession
					.getMapper(UsersMapper.class);
			userMapper.insertUser(users);
			
			
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}		
	}
	
	public static void updateUser(Users users){
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory()
				.openSession();
		try {
			
			UsersMapper userMapper = sqlSession
					.getMapper(UsersMapper.class);
			userMapper.updateUser(users);
			
			
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}		
	}
	
	public static void deleteUser(Users users){
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory()
				.openSession();
		try {
			
			UsersMapper userMapper = sqlSession
					.getMapper(UsersMapper.class);
			userMapper.deleteUser(users);
			
			
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}		
	}
}
