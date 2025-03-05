package com.a5a5lab.fapp.contactaddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a5a5lab.fapp.group1.Group1Service;

@Controller
public class ContactAddressController {

	@Autowired
	ContactAddressService contactAddressService; // DI(객체인증)

	// 방법1.
//	@RequestMapping(value = "/contactAddress/contactAddressXdmList")
//	public String contactAddressXdmList(Model model) {
//		List<ContactAddressDto> contactAddressDtos = new ArrayList<>();
//		
//		contactAddressDtos = contactAddressService.selectList();	
//		
//		model.addAttribute("list",contactAddressDtos);		
//		
//		return "contactAddress/contactAddressXdmList";
//	}
	
	// 방법2.
	@RequestMapping(value = "/contactAddress/contactAddressXdmList")
	public String group1XdmList(Model model) {
		model.addAttribute("listb",contactAddressService.selectList());		
		return "contactAddress/contactAddressXdmList";
	}
	
}
