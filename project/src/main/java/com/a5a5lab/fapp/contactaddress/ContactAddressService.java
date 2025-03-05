package com.a5a5lab.fapp.contactaddress;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a5a5lab.fapp.group1.Group1Dao;
import com.a5a5lab.fapp.group1.Group1Dto;

@Service
public class ContactAddressService {

	
	@Autowired
	ContactAddressDao contactAddressDao;
//	ContactAddressDao contactAddressDao = new ContactAddressDao;

	// 방법1.
//	public List<ContactAddressDto> selectList(){
//		List<ContactAddressDto> contactAddressDtos = new ArrayList<>();
//		
//		contactAddressDtos = contactAddressDao.selectList();		
//		
//		return contactAddressDtos;
//	}
	
	// 방법2.
	public List<ContactAddressDto> selectList(){
		return contactAddressDao.selectList();
	}
	
}
