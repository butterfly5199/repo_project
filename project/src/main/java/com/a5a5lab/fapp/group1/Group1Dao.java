package com.a5a5lab.fapp.group1;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface Group1Dao {
	
//	mapper에서 해당하는 쿼리와 연결시켜주고
//	쿼리 결과를 가져옴
	
	public List<Group1Dto> selectList();
	public Group1Dto selectOne(Group1Dto group1Dto);
	public int insert(Group1Dto group1Dto);
	public int update(Group1Dto group1Dto);
	public int delete(Group1Dto group1Dto);
	public int uelete(Group1Dto group1Dto);
	
//	public Dao<Group1Dto> selectOne();	
}
