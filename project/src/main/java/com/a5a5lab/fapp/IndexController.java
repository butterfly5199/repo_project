package com.a5a5lab.fapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value="/index")  // localhost:8080/index...
	public String index() {
		return "index";
	}
	@RequestMapping(value="/index2")
	public String index2() {
		return "abc/inddex";
	}
	
	@RequestMapping(value="/index3") 
	public String index3() {
		return "abc/inddexx";
	}
// =================================================	
	
	@RequestMapping(value="/helloWorld") 
	public String helloWorld() {
		return "helloWorld";
	}	
	
	@RequestMapping(value="/aaa/bbb") 
	public String helloWorld2() {
		return "bbb/aaa";
	}	
	
	@RequestMapping(value = "/xxx/yyy/zzz")
	public String helloWorld3() {
	   return "yyy/zzz";
	}
	
	@RequestMapping(value="/ttt/yyy") 
	public String helloWorld4() {
		return "zzz/yyy/xxx";
	}
	
	@RequestMapping(value="/infra/member/loginXdmForm") 
	public String helloWorld5() {
		return "adm/v1/tmpname/infra/member/loginForm";
	}
	
	@RequestMapping(value="/infra/codegroup/codeGroupXdmList") 
	public String helloWorld6() {
		return "adm/v1/tmpname/infra/codegroup/codeGroupList";
	}
	
	@RequestMapping(value="/infra/codegroup/codeGroupXdmForm") 
	public String helloWorld7() {
		return "adm/v1/tmpname/infra/codegroup/codeGroupForm";
	}
		
	@RequestMapping(value="/infra/member/loginUsrForm") 
	public String helloWorld8() {
		return "usr/v1/tmpname/infra/member/loginForm";
	}	
	
	
	
	
}
