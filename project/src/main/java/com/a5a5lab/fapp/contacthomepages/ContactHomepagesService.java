package com.a5a5lab.fapp.contacthomepages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a5a5lab.fapp.group1.Group1Dao;
import com.a5a5lab.fapp.group1.Group1Dto;

@Service
public class ContactHomepagesService {

	@Autowired
	ContactHomepagesDao contactHomepagesDao;
//	ContactHomepagesDao contactHomepagesDao = new ContactHomepagesDao;

	// 방법1.
//	public List<ContactHomepagesDto> selectList(){
//		List<ContactHomepagesDto> contactHomepagesDtos = new ArrayList<>();
//		
//		contactHomepagesDtos = contactHomepagesDao.selectList();		
//		
//		return contactHomepagesDtos;
//	}
	
	// 방법2.
	public List<ContactHomepagesDto> selectList(){
		return contactHomepagesDao.selectList();
	}
	
}


