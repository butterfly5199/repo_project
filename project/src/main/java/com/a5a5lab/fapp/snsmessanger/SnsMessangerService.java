package com.a5a5lab.fapp.snsmessanger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a5a5lab.fapp.group1.Group1Dao;
import com.a5a5lab.fapp.group1.Group1Dto;

@Service
public class SnsMessangerService {

	@Autowired
	SnsMessangerDao snsMessangerDao;
//	SnsMessangerDao snsMessangerDao = new SnsMessangerDao;

	// 방법1.
//	public List<SnsMessangerDto> selectList(){
//		List<SnsMessangerDto> snsMessangerDtos = new ArrayList<>();
//		
//		snsMessangerDtos = snsMessangerDao.selectList();		
//		
//		return snsMessangerDtos;
//	}
	
	// 방법2.
	public List<SnsMessangerDto> selectList(){
		return snsMessangerDao.selectList();
	}
	
}


