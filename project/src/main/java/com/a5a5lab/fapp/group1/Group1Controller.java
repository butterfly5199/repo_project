package com.a5a5lab.fapp.group1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Group1Controller {
	
//입력되는 주소에 매칭이 되는 html 정보를 정의
// html로 데이터 전달
	
	@Autowired
	Group1Service group1Service;
			
	@RequestMapping(value = "/group1/group1XdmList")
	public String group1XdmList(Model model) {
		List<Group1Dto> group1Dtos = new ArrayList<>();
		
		group1Dtos = group1Service.selectList();	
		
		model.addAttribute("list",group1Dtos);		
		
		return "group1/group1XdmList";
	}
	
//	@RequestMapping(value = "/group1/group1XdmList")
//	public String group1XdmList(Model model) {
//		model.addAttribute("list",group1Service.group1XdmList);		
//		
//		return "group1XdmList";
//	}

}
