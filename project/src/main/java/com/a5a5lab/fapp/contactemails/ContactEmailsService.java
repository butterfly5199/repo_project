package com.a5a5lab.fapp.contactemails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactEmailsService {

	@Autowired
	ContactEmailsDao contactEmailsDao;
//	ContactEmailsDao contactEmailsDao = new ContactEmailsDao;
	
	// 방법1.
//	public List<ContactEmailsDto> selectList(){
//		List<ContactEmailsDto> contactEmailsDtos = new ArrayList<>();
//		
//		contactEmailsDtos = contactEmailsDao.selectList();		
//		
//		return contactEmailsDtos;
//	}
	
	// 방법2.
	public List<ContactEmailsDto> selectList(){
		return contactEmailsDao.selectList();
	}
	
}
