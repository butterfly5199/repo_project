package com.a5a5lab.fapp.group1;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface Group1Dao {
	
//	mapper에서 해당하는 쿼리와 연결시켜주고
//	쿼리 결과를 가져옴
	
	public List<Group1Dto> selectList();
	
	
}
