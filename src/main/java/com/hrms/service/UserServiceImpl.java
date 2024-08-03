package com.hrms.service;

import com.hrms.dao.RegisterDaoImpl;
import com.hrms.model.RegisterModel;

public class UserServiceImpl implements UserService{

	@Override
	public int registerUser(RegisterModel model) {
		// TODO Auto-generated method stub
		RegisterDaoImpl dao = new RegisterDaoImpl();
		
		return dao.registerUser(model);
	}

}
