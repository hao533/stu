package cn.tedu.sample.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.sample.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {
	
	@Autowired
	UserMapper mapper;
	
	@Test
	public void addnew() {
		User user = new User();
		user.setUsername("springmvc");
		user.setPassword("000000");
		user.setAge(29);
		user.setPhone("13000130000");
		user.setEmail("springmvc@163.com");
		Integer rows = mapper.addnew(user);
		System.err.println("rows=" + rows);
	}

}








