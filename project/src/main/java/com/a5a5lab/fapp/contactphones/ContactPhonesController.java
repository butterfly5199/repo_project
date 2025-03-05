package com.a5a5lab.fapp.contactphones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a5a5lab.fapp.group1.Group1Service;

@Controller
public class ContactPhonesController {

	@Autowired
	ContactPhonesService contactPhonesService; // DI(객체인증)

	// 방법1.
//	@RequestMapping(value = "/contactphones/contactPhonesXdmList")
//	public String contactPhonesXdmList(Model model) {
//		List<ContactPhonesDto> contactPhonesDtos = new ArrayList<>();
//		
//		group1Dtos = group1Service.selectList();	
//		
//		model.addAttribute("list",contactPhonesDtos);		
//		
//		return "contactphones/contactPhonesXdmList";
//	}
	
	// 방법2.
	@RequestMapping(value = "/contactphones/contactPhonesXdmList")
	public String contactPhonesXdmList(Model model) {
		model.addAttribute("list",contactPhonesService.selectList());		
		return "contactphones/contactPhonesXdmList";
	}
	
}
