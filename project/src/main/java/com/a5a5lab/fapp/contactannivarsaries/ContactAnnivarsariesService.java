package com.a5a5lab.fapp.contactannivarsaries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a5a5lab.fapp.group1.Group1Dao;
import com.a5a5lab.fapp.group1.Group1Dto;

@Service
public class ContactAnnivarsariesService {

	@Autowired
	ContactAnnivarsariesDao contactAnnivarsariesDao;
//	ContactAnnivarsariesDao contactAnnivarsariesDao = new ContactAnnivarsariesDao;

	// 방법1.
//	public List<ContactAnnivarsariesDto> selectList(){
//		List<ContactAnnivarsariesDto> contactAnnivarsariesDtos = new ArrayList<>();
//		
//		contactAnnivarsariesDtos = contactAnnivarsariesDao.selectList();		
//		
//		return contactAnnivarsariesDtos;
//	}
	
	// 방법2.
	public List<ContactAnnivarsariesDto> selectList(){
		return contactAnnivarsariesDao.selectList();
	}
	
}

