package com.a5a5lab.fapp.contactannivarsaries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a5a5lab.fapp.group1.Group1Service;

@Controller
public class ContactAnnivarsariesController {

	@Autowired
	ContactAnnivarsariesService contactAnnivarsariesService; // DI(객체인증)

	// 방법1.
//	@RequestMapping(value = "/contactannivarsaries/contactAnnivarsariesXdmList")
//	public String contactAnnivarsariesXdmList(Model model) {
//		List<ContactAnnivarsariesDto> contactAnnivarsariesDtos = new ArrayList<>();
//		
//		contactAnnivarsariesDtos = contactAnnivarsariesService.selectList();	
//		
//		model.addAttribute("list",contactAnnivarsariesDtos);		
//		
//		return "contactannivarsaries/contactAnnivarsariesXdmList";
//	}
	
	// 방법2.
	@RequestMapping(value = "/contactannivarsaries/contactAnnivarsariesXdmList")
	public String contactAnnivarsariesXdmList(Model model) {
		model.addAttribute("list",contactAnnivarsariesService.selectList());		
		return "contactannivarsaries/contactAnnivarsariesXdmList";
	}
	
}

