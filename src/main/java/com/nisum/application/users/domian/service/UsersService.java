package com.nisum.application.users.domian.service;


import java.util.List;
import java.util.Optional;

import com.nisum.application.users.domian.DetailResponse;
import com.nisum.application.users.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
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
		if(user.getName()!=null && user.getName()!=""
				&& user.getEmail()!=null && user.getEmail()!=""
				&& user.getPassword()!=null && user.getPassword()!=""
				&& user.getPhones()!=null){
		if(AppUtil.isValidEmailId(user.getEmail()) ==true){
			if(AppUtil.validatePassword(user.getPassword()) == true){
				if(!isEmailRegisterd(user.getEmail())){
					user.setId(id);
					user.setCreated(AppUtil.getDateSystem());
					user.setModified(AppUtil.getDateSystem());
					user.setLastLogin(AppUtil.getDateSystem());
					user.setToken(AppUtil.getToken());
					user.setIsactive(true);
					user.getPhones().forEach(item ->{
						item.setUsers_id(id);
					});
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
		}else{
			detail.setCode(201);
			detail.setMessage("Validar que los campos (name, email, password, phones[]) nu sean nulos o bacios");
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
