package com.a5a5lab.fapp.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

	@Autowired
	ContactDao contactDao;
//	ContactDao contactDao = new ContactDao;

	// 방법1.
//	public List<ContactDto> selectList(){
//		List<ContactDto> contactDtos = new ArrayList<>();
//		
//		contactDtos = contactDao.selectList();		
//		
//		return contactDtos;
//	}
	
	// 방법2.
	public List<ContactDto> selectList(){
		return contactDao.selectList();
	}
	
}
