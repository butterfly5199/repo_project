package com.a5a5lab.fapp.group1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Group1Service {
	
//	로직을 정의하는 부분

//	여러 건의 데이터를 가지고 온다.
	
	@Autowired
	Group1Dao group1Dao;
//	Group1Dao group1Dao = new Group1Dao;

	// 방법1.
//	public List<Group1Dto> selectList(){
//		List<Group1Dto> group1Dtos = new ArrayList<>();
//		
//		group1Dtos = group1Dao.selectList();		
//		
//		return group1Dtos;
//	}
	
	// 방법2.
	public List<Group1Dto> selectList(){
		return group1Dao.selectList();
	}
	
}


