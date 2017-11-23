package com.springriver.example.mybatis.mapper;

import com.springriver.example.mybatis.bean.Users;

public interface UsersMapper {
	public Users selectUserById(int id);
	public void insertUser(Users users);
	public void updateUser(Users users);
	public void deleteUser(Users users);
}
