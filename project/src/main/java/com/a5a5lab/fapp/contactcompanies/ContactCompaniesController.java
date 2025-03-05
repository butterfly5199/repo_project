package com.a5a5lab.fapp.contactcompanies;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactCompaniesController {
	@Autowired
	ContactCompaniesService contactCompaniesService;
	
	
	
	@RequestMapping(value = "/contactCompanies/contactCompaniesXdmList")
	public String contactCompaniesXdmList(Model model) {
		model.addAttribute("list",contactCompaniesService.selectList());		
		return "contactCompanies/contactCompaniesXdmList";
	}
}
