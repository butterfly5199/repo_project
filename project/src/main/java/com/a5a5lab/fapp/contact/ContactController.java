package com.a5a5lab.fapp.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a5a5lab.fapp.group1.Group1Dto;

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
	
	@RequestMapping(value="/contact/contactXdmView")
	public String contactXdmView(Model model, ContactDto contactDto) {
		
		model.addAttribute("item", contactService.selectOne(contactDto));
		return "contact/contactXdmView";
	}
	
	@RequestMapping(value="/contact/contactXdmForm")
	public String contactXdmForm() {
		
		return "contact/contactXdmForm";
	}
	
	@RequestMapping(value="/contact/contactXdmInst")
	public String contactXdmInst(ContactDto contactDto) {
		System.out.println("contactDto.getSeq(): " + contactDto.getSeq());
		System.out.println("contactDto.getMemo(): " + contactDto.getMemo());
		
		contactService.insert(contactDto);
		System.out.println("contactDto.getSeq(): " + contactDto.getSeq());
		
		return  "redirect:/contact/contactXdmList";		
	}
		
	@RequestMapping(value="/contact/contactXdmMfom")
	public String contactXdmMfom(ContactDto contactDto, Model model) {
		
		model.addAttribute("item", contactService.selectOne(contactDto));
		
		return "contact/contactXdmMfom";
	}
	
	@RequestMapping(value = "/contact/contactXdmUpdt")
	public String contactXdmUpdt(ContactDto contactDto) {
		System.out.println("contactDto.getSeq(): " + contactDto.getSeq());
		System.out.println("contactDto.getName(): " + contactDto.getMemo());
		contactService.update(contactDto);		
		return "redirect:/contact/contactXdmList";
	}
	
	@RequestMapping(value = "/contact/contactXdmDele")
	public String contactXdmDele(ContactDto contactDto) {
		contactService.delete(contactDto);
		return "redirect:/contact/contactXdmList";
	}
	
	@RequestMapping(value="/contact/contactXdmUele")
	public String contactXdmUele(ContactDto contactDto) {
		contactService.uelete(contactDto);
		return "redirect:/contact/contactXdmList";
	}
}
