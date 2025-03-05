package com.a5a5lab.fapp.contactgroups;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactGroupsController {

	@Autowired
	ContactGroupsService contactGroupsService; // DI(객체인증)

	// 방법1.
//	@RequestMapping(value = "/contactGroups/contactGroupsXdmList")
//	public String contactGroupsXdmList(Model model) {
//		List<ContactGroupsDto> contactGroupsDtos = new ArrayList<>();
//		
//		contactGroupsDtos = contactGroupsService.selectList();	
//		
//		model.addAttribute("list",contactGroupsDtos);		
//		
//		return "contactGroups/contactGroupsXdmList";
//	}
	
	// 방법2.
	@RequestMapping(value = "/contactGroups/contactGroupsXdmList")
	public String contactGroupsXdmList(Model model) {
		model.addAttribute("list",contactGroupsService.selectList());		
		return "contactGroups/contactGroupsXdmList";
	}
	
}