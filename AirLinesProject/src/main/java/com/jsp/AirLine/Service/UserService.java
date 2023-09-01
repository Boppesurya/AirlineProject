package com.jsp.AirLine.Service;

import com.jsp.AirLine.DTO.UserDTO;

public interface UserService {
 
	int addUser(UserDTO userDTO);
	UserDTO findUser(int id);
	//UserDTO logIn(String UserName,String password);
}
