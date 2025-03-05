package com.a5a5lab.fapp.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

	@Autowired
	ContactService contactService; // DI(객체인증)

	// 방법1.
//	@RequestMapping(value = "/contact/contactXdmList")
//	public String contactXdmList(Model model) {
//		List<ContactDto> contactDtos = new ArrayList<>();
//		
//		contactDtos = contactService.selectList();	
//		
//		model.addAttribute("list",contactDtos);		
//		
//		return "contact/contactXdmList";
//	}
	
	// 방법2..
	@RequestMapping(value = "/contact/contactXdmList")
	public String contactXdmList(Model model) {
		model.addAttribute("list",contactService.selectList());		
		return "contact/contactXdmList";
	}
		
	
	
}
