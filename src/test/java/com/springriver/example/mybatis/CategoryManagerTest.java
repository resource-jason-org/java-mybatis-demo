package com.springriver.example.mybatis;

import org.junit.Test;

import com.springriver.example.mybatis.bean.Category;
import com.springriver.example.mybatis.bean.Users;
import com.springriver.example.mybatis.util.CatgegoryManager;
import com.springriver.example.mybatis.util.UsersManager;

public class CategoryManagerTest {

	
	@Test
	public void testSelectUser() {
		Category category = CatgegoryManager.selectCategoryById(1);
		assert(category != null);
		assert(category.getCategoryName().equals("Apparel"));
		
	}

	@Test
	public void testInsertUser() {
		Category category = new Category();
		category.setCategoryName("Shoes");
		CatgegoryManager.insertCategory(category);
		Category insertedCategory = CatgegoryManager.selectCategoryById(category.getCategoryId());
		
		assert(insertedCategory != null);
		assert(insertedCategory.getCategoryName().equals("Shoes"));
		
	}	
	
	@Test
	public void testInsertUsers() {
		Users users = new Users();
		users.setName("testname");
		users.setEmail("testemail");
		UsersManager.insertUser(users);
	}	
}
