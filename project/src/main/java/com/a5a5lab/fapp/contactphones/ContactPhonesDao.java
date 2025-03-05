package com.a5a5lab.fapp.contactphones;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a5a5lab.fapp.group1.Group1Dto;

@Repository
public interface ContactPhonesDao {

	public List<ContactPhonesDto> selectList();
}
