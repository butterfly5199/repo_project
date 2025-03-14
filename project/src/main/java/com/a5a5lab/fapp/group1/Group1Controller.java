package com.a5a5lab.fapp.group1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Group1Controller {
	
//입력되는 주소에 매칭이 되는 html 정보를 정의
// html로 데이터 전달
	
	@Autowired
	Group1Service group1Service; // DI(객체인증)

	// 방법1.
//	@RequestMapping(value = "/group1/group1XdmList")
//	public String group1XdmList(Model model) {
//		List<Group1Dto> group1Dtos = new ArrayList<>();
//		
//		group1Dtos = group1Service.selectList();	
//		
//		model.addAttribute("listb",group1Dtos);		
//		
//		return "group1/group1XdmList";
//	}
	
	// 방법2.
	@RequestMapping(value = "/group1/group1XdmList")
	public String group1XdmList(Model model) {
		model.addAttribute("listb",group1Service.selectList());		
		return "group1/group1XdmList";
	}
	
	
	@RequestMapping(value = "/group1/group1XdmView")
	public String group1XdmView(Model model, Group1Dto group1Dto) {
	
				
		model.addAttribute("item", group1Service.selectOne(group1Dto));		
		return "group1/group1XdmView";
	}
		
	
	@RequestMapping(value = "/group1/group1XdmForm")
	public String group1XdmForm() {
		
		return "group1/group1XdmForm";
	}
	
	
	@RequestMapping(value = "/group1/group1XdmInst")
	public String group1XdmInst(Group1Dto group1Dto) {
		System.out.println("group1Dto.getSeq(): " + group1Dto.getSeq());
		System.out.println("group1Dto.getName(): " + group1Dto.getName());
		
		group1Service.insert(group1Dto);
		System.out.println("group1Dto.getSeq(): " + group1Dto.getSeq());
		
		return "redirect:/group1/group1XdmList";	
	}
	
	@RequestMapping(value = "/group1/group1XdmMfom")
	public String group1XdmMfom(Group1Dto group1Dto, Model model) {
		
		model.addAttribute("item", group1Service.selectOne(group1Dto));	
		
		return "/group1/group1XdmMfom";
	}

	
//	@RequestMapping(value = "/group1/group1XdmUpdt1")
//	public String group1XdmUpdt1() {
//		
//		return "redirect:/group1/group1XdmList";
//	}
	
	@RequestMapping(value = "/group1/group1XdmUpdt")
	public String group1XdmUpdt(Group1Dto group1Dto) {
		System.out.println("group1Dto.getSeq(): " + group1Dto.getSeq());
		System.out.println("group1Dto.getName(): " + group1Dto.getName());
		group1Service.update(group1Dto);		
		return "redirect:/group1/group1XdmList";
	}
	
	@RequestMapping(value = "/group1/group1XdmDele")
	public String group1XdmDele(Group1Dto group1Dto) {
		group1Service.delete(group1Dto);
		return "redirect:/group1/group1XdmList";
	}
	
	@RequestMapping(value = "/group1/group1XdmUele")
	public String group1XdmUele(Group1Dto group1Dto) {
		group1Service.uelete(group1Dto);
		return "redirect:/group1/group1XdmList";
	}
	
}




















// listb 변수 : group1XdmList.html 파일과 매칭상태 비교 

//<tr th:each="lista:${listb}"> 
//<td th:text="${lista.seq}"></td>
//<td th:text="${lista.name}"></td>
//</tr>

// listb 변수에서 받은 자료를 lista에 담는 것. 동일 자료 위치 확인 필요.
