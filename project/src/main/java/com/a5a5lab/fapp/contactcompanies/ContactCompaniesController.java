package com.a5a5lab.fapp.contactcompanies;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactCompaniesController {
	@Autowired
	ContactCompaniesService contactCompaniesService;	
	
	
	@RequestMapping(value = "/contactcompanies/contactCompaniesXdmList")
	public String contactCompaniesXdmList(Model model) {
		model.addAttribute("list",contactCompaniesService.selectList());		
		return "contactcompanies/contactCompaniesXdmList"; 
	}
	
	
//	@RequestMapping(value="/contactcompanies/contactCompaniesXdmView")
//	public String contactCompaniesXdmView(Model model, ContactCompaniesDto contactCompaniesDto) {
		
//		model.addAttribute("item", contactCompaniesService.selectOne(contactCompaniesDto));
//		return "contactcompanies/contactCompaniesXdmView";
//	}
//	
//	@RequestMapping(value="/contactcompanies/contactCompaniesXdmForm")
//	public String contactCompaniesXdmForm() {
//		
//		return "contactcompanies/contactCompaniesXdmForm";
//	}
	
//	@RequestMapping(value="/contactcompanies/contactCompaniesXdmInst")
//	public String contactCompaniesXdmInst(ContactCompaniesDto contactCompaniesDto) {
//		System.out.println("contactcompaniesDto.getSeq(): " + contactCompaniesDto.getSeq());
//		System.out.println("contactcompaniesDto.getName(): " + contactcompaniesDto.getName());
		
//		contactCompaniesService.insert(contactCompaniesDto);
//		System.out.println("contactCompaniesDto.getSeq(): " + contactCompaniesDto.getSeq());
//		
//		return "redirect:/contactcompanies/contactCompaniesXdmList";
//	}
	
}
