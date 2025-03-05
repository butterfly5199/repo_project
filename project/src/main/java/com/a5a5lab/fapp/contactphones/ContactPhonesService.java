package com.a5a5lab.fapp.contactphones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a5a5lab.fapp.group1.Group1Dao;
import com.a5a5lab.fapp.group1.Group1Dto;

@Service
public class ContactPhonesService {

	@Autowired
	ContactPhonesDao contactPhonesDao;
//	ContactPhonesDao contactPhonesDao = new ContactPhonesDao;

	// 방법1.
//	public List<ContactPhonesDto> selectList(){
//		List<ContactPhonesDto> contactPhonesDtos = new ArrayList<>();
//		
//		contactPhonesDtos = contactPhonesDao.selectList();		
//		
//		return contactPhonesDtos;
//	}
	
	// 방법2.
	public List<ContactPhonesDto> selectList(){
		return contactPhonesDao.selectList();
	}
	
}


