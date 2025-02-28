package com.a5a5lab.fapp.group1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Group1Controller {
	
//입력되는 주소에 매칭이 되는 html 정보를 정의
// html로 데이터 전달
	
	@Autowired
	
	
	
	@RequestMapping(value = "/group1/group1XdmList")
	public String group1XdmList() {
		return "group1/group1XdmList";
	}

}
