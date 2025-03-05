package com.a5a5lab.fapp.snsmessanger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a5a5lab.fapp.group1.Group1Service;

@Controller
public class SnsMessangerController {

	@Autowired
	SnsMessangerService snsMessangerService; // DI(객체인증)

	// 방법1.
//	@RequestMapping(value = "/snsmessanger/snsMessangerXdmList")
//	public String snsMessangerXdmList(Model model) {
//		List<SnsMessangerDto> snsMessangerDtos = new ArrayList<>();
//		
//		snsMessangerDtos = snsMessangerService.selectList();	
//		
//		model.addAttribute("list",snsMessangerDtos);		
//		
//		return "snsmessanger/snsMessangerXdmList";
//	}
	
	// 방법2.
	@RequestMapping(value = "/snsmessanger/snsMessangerXdmList")
	public String snsMessangerXdmList(Model model) {
		model.addAttribute("list",snsMessangerService.selectList());		
		return "snsmessanger/snsMessangerXdmList";
	}
	
}

