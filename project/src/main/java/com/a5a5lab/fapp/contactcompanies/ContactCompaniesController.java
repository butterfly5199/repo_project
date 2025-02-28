package com.a5a5lab.fapp.contactcompanies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactCompaniesController {

	@Autowired
	ContactCompaniesService contactCompaniesService; 
	
	// 방법1.
//	@RequestMapping(value = "/contactCompanies/contactCompaniesXdmList")
//	public String contactCompaniesXdmList(Model model) {
//		List<ContactCompaniesDto> contactCompaniesDtos = new ArrayList<>();
//		
//		contactCompaniesDtos = contactCompaniesService.selectList();	
//		
//		model.addAttribute("list",contactCompaniesDtos);		
//		
//		return "contactCompanies/contactCompaniesXdmList";
//	}
	
	// 방법2.
	
	@RequestMapping(value = "/contactCompanies/contactCompaniesXdmList")
	public String contactCompaniesXdmList(Model model) {
		model.addAttribute("list",contactCompaniesService.selectList());		
		return "contactCompanies/contactCompaniesXdmList";
	}
	
}
