package com.jsp.AirLine.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.AirLine.DTO.UserDTO;
import com.jsp.AirLine.Entity.User;
import com.jsp.AirLine.Repository.UserRepository;
@Service
public class UserServiceImp implements UserService  {
    
	@Autowired
	private UserRepository userRepository;
	@Override
	public int addUser(UserDTO userDTO) {
		User userInfo = userRepository.save(User.builder()
				.firstName(userDTO.getFirstName())
				.lastName(userDTO.getLastName())
				.mobaileNo(userDTO.getMobaileNo())
				.gender(userDTO.getGender())
				.userName(userDTO.getUserName())
				.password(userDTO.getPassword())
				.conformPassword(userDTO.getConformPassword())
				.build());
		System.out.println(userDTO);
		return userInfo.getId();
	}
	@Override
	public UserDTO findUser(int id) {
		Optional<User> UserInfo = userRepository.findById(id);
		if (UserInfo.isPresent()) {
			User user = UserInfo.get();
			UserDTO userDTO = UserDTO.builder()
					.firstName(user.getFirstName())
					.lastName(user.getLastName())
					.gender(user.getGender())
					.mobaileNo(user.getMobaileNo())
					.userName(user.getUserName())
					.password(user.getPassword())
					.conformPassword(user.getConformPassword())
					.build();
			return userDTO;
		} else {
                
			return null;
		}
		
	}
	
}
