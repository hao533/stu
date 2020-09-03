package cn.tedu.sample.mapper;

import org.apache.ibatis.annotations.Insert;

import cn.tedu.sample.entity.User;

public interface UserMapper {
	
//	@Insert("INSERT INTO t_user ("
//		+ "username,password,age,phone,email"
//		+ ") VALUES ("
//		+ "#{username},#{password},#{age},#{phone},#{email}"
//		+ ")")
	Integer addnew(User user);

}





