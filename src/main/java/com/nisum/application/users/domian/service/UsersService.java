package com.nisum.application.users.domian.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.nisum.application.users.domian.DetailResponse;
import com.nisum.application.users.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nisum.application.users.domian.User;
import com.nisum.application.users.domian.repository.UsersDomainRepository;

@Service
public class UsersService  {

	@Autowired
	private UsersDomainRepository domianRepository;


	public List<User> getAll() {
		return domianRepository.getAll();
	}

	public DetailResponse<User> save(User user) {
		String id = AppUtil.generateId();
		DetailResponse<User> detail = new DetailResponse<>();
		if(AppUtil.isValidEmailId(user.getEmail()) ==true){
			if(AppUtil.validatePassword(user.getPassword()) == true){
				if(!isEmailRegisterd(user.getEmail())){
					System.out.println("Nuevo usuario **** ****");
					System.out.println("" +user.getName() + " " + user.getEmail());
					System.out.println("" + user.getPhones().toString());
					user.setId(id);
					user.setCreated(AppUtil.getDateSystem());
					user.setModified(AppUtil.getDateSystem());
					user.setLastLogin(AppUtil.getDateSystem());
					user.setToken(id);
					user.setIsactive(true);
					user.getPhones().forEach(item ->{
						item.setUsers_id(id);
						System.out.println(  " phone :" + item.getUsers_id());
					});

					System.out.println("success " + user.getId() );
					detail.setMessage("Registro exitoso!");
					detail.setData(domianRepository.save(user));
					return detail;

				}else{
					detail.setCode(201);
					detail.setMessage("Correo ya registrado");
				}
			}else{
				detail.setCode(201);
				detail.setMessage("El password no es seguro,(Una mayúscula,letras minúsculas y dos numeros)");
			}
		}else{
			detail.setCode(201);
			detail.setMessage("El correo no cumple con el formato correcto favor de validar: Ejemplo (juan@rodriguez.org)");
		}
		return detail;
	}
	public boolean isEmailRegisterd(String email){
		return findByEmail(email).map(user -> {
			domianRepository.findByEmail(email);
			return true;
		}).orElse(false);
	}

	public Optional<User> findByEmail (String email){
		return domianRepository.findByEmail(email);
	}

	

}
