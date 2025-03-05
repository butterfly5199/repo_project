package com.a5a5lab.fapp.contactemails;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactEmailsDao {

	public List<ContactEmailsDto> selectList();
}
