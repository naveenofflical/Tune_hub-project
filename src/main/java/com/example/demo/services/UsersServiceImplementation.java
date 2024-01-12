package com.example.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.UsersRepository;

import com.example.demo.entities.Users;
@Service
public class UsersServiceImplementation implements UsersService 
{	@Autowired
		UsersRepository repo;
		@Override
		public String addUser(Users user) 
		{
			repo.save(user);
			return "user added successfully";
		}
		@Override
		public boolean emailExists(String email) {
			if(repo.findByEmail(email)==null) {
				return false;
			}
			else {
				return true;
		}
	}
		@Override
		public boolean validateUser(String email, String name) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public String getRole(String email) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Users getUser(String email) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void updateUser(Users user) {
			// TODO Auto-generated method stub
			
		}
}



