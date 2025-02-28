package com.a5a5lab.fapp.contactcompanies;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactCompaniesDao {

	public List<ContactCompaniesDto> selectList();
	
}
