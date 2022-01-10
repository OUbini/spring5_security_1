package edu.kosmo.ex.mapper;


import javax.inject.Inject;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import edu.kosmo.ex.vo.AuthVO;
import edu.kosmo.ex.vo.UserVO;

@Mapper
public interface UserMapper {

	public UserVO getUser(String username);

	@Insert("insert into users(username,password,enabled) values(#{username},#{password},#{enabled})")
	public int insertUser(UserVO userVO);

	@Insert("insert into AUTHORITIES (username,AUTHORITY) values(#{username},'ROLE_USER')")
	public void insertAuthorities(UserVO UserVO);

}