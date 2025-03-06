package com.a5a5lab.fapp.contactcompanies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactCompaniesService {	
	
	@Autowired
	ContactCompaniesDao contactCompaniesDao;
	
	// 방법1.
//	public List<ContactCompaniesDto> selectList(){
//		List<ContactCompaniesDto> contactCompaniesDtos = new ArrayList<>();
//		
//		contactCompaniesDtos = contactCompaniesDao.selectList();		
//		
//		return contactCompaniesDtos;
//	}
	
	// 방법2.
	public List<ContactCompaniesDto> selectList(){
		return contactCompaniesDao.selectList();
	}
	
//	public ContactCompaniesDto selectOne(ContactCompaniesDto contactcompaniesDto){
//		return contactCompaniesDao.selectOne(contactCompaniesDto);
//	}
//	
//	public int insert(ContactCompaniesDto contactCompaniesDto) {
//		return contactcompaniesDao.insert(contactCompaniesDto);		
//	}
	
}
