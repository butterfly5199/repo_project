package com.a5a5lab.fapp.contactgroups;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a5a5lab.fapp.group1.Group1Dao;
import com.a5a5lab.fapp.group1.Group1Dto;

@Service
public class ContactGroupsService {

	@Autowired
	ContactGroupsDao contactGroupsDao;
//	ContactGroupsDao contactGroupsDao = new ContactGroupsDao;

	// 방법1.
//	public List<ContactGroupsDto> selectList(){
//		List<ContactGroupsDto> contactGroupsDtos = new ArrayList<>();
//		
//		contactGroupsDtos = contactGroupsDao.selectList();		
//		
//		return contactGroupsDtos;
//	}
	
	// 방법2.
	public List<ContactGroupsDto> selectList(){
		return contactGroupsDao.selectList();
	}
	
}
