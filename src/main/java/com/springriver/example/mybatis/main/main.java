package com.springriver.example.mybatis.main;

import com.springriver.example.mybatis.bean.Category;
import com.springriver.example.mybatis.bean.Users;
import com.springriver.example.mybatis.util.CatgegoryManager;
import com.springriver.example.mybatis.util.UsersManager;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users users = new Users();
		users.setName("testname");
		users.setEmail("testemail");
		users.setId(5);
		
		UsersManager.deleteUser(users);
		Category category = new Category();
		category.setCategoryName("Shoes");
		CatgegoryManager.insertCategory(category);
		
		
	}

}
