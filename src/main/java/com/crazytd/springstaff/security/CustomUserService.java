package com.crazytd.springstaff.security;

import com.crazytd.springstaff.entity.User;
import com.crazytd.springstaff.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if (user == null){
			throw new UsernameNotFoundException("用户名不存在");
		}
		System.out.println("username"+username);
		System.out.println("username:"+user.getUsername()+";password:"+user.getPassword());
		return user;
	}
}
