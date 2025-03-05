package com.a5a5lab.fapp.snsmessanger;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a5a5lab.fapp.group1.Group1Dto;

@Repository
public interface SnsMessangerDao {

	public List<SnsMessangerDto> selectList();
}
