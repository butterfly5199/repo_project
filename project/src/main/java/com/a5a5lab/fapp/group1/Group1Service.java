package com.a5a5lab.fapp.group1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Group1Service {
	
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
	
	public Group1Dto selectOne(Group1Dto group1Dto){
		return group1Dao.selectOne(group1Dto);
	}
	
	public int insert(Group1Dto group1Dto){
		return group1Dao.insert(group1Dto);
	}
}


