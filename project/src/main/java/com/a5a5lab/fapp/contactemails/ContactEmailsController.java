package com.a5a5lab.fapp.contactemails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactEmailsController {

	@Autowired
	ContactEmailsService contactEmailsService;
	
	// 방법1.
//	@RequestMapping(value = "/contactEmails/contactEmailsXdmList")
//	public String contactEmailsXdmList(Model model) {
//		List<ContactEmailsDto> contactEmailsDtos = new ArrayList<>();
//		
//		contactEmailsDtos = contactEmailsService.selectList();	
//		
//		model.addAttribute("list",contactEmailsDtos);		
//		
//		return "contactEmails/contactEmailsXdmList";
//	}
	
	// 방법2.
	@RequestMapping(value = "/contactEmails/contacteEmailsXdmList")
	public String contactEmailsXdmList(Model model) {
		model.addAttribute("list",contactEmailsService.selectList());		
		return "contactEmails/contactEmailsXdmList";
	}
		
}
