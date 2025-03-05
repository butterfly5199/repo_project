package com.a5a5lab.fapp.contact;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao {

	public List<ContactDto> selectList();
}
