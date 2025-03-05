package com.a5a5lab.fapp.contacthomepages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a5a5lab.fapp.group1.Group1Service;

@Controller
public class ContactHomepagesController {

	@Autowired
	ContactHomepagesService contactHomepagesService; // DI(객체인증)

	// 방법1.
//	@RequestMapping(value = "/contactHomepages/contactHomepagesXdmList")
//	public String contactHomepagesXdmList(Model model) {
//		List<ContactHomepagesDto> contactHomepagesDtos = new ArrayList<>();
//		
//		contactHomepagesDtos = contactHomepagesService.selectList();	
//		
//		model.addAttribute("list",contactHomepagesDtos);		
//		
//		return "contactHomepages/contactHomepagesXdmList";
//	}
	
	// 방법2.
	@RequestMapping(value = "/contactHomepages/contactHomepagesXdmList")
	public String contactHomepagesXdmList(Model model) {
		model.addAttribute("list",contactHomepagesService.selectList());		
		return "contactHomepages/contactHomepagesXdmList";
	}
	
}
