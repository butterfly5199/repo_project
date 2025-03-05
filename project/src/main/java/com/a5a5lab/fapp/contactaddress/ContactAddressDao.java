package com.a5a5lab.fapp.contactaddress;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a5a5lab.fapp.group1.Group1Dto;

@Repository
public interface ContactAddressDao {

	public List<ContactAddressDto> selectList();
}
