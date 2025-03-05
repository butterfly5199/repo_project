package com.a5a5lab.fapp.contactannivarsaries;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a5a5lab.fapp.group1.Group1Dto;

@Repository
public interface ContactAnnivarsariesDao {

	public List<ContactAnnivarsariesDto> selectList();
}
