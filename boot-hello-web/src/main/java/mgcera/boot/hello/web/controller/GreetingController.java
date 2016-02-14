package mgcera.boot.hello.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class GreetingController {
	
	@RequestMapping
	public String sayHello(){
		return "Hello ...";
	}
	
	@RequestMapping(value="/hi")
	@ResponseBody
	public String sayHi(){
	    return "Hi..";
	}
	
	@RequestMapping(value="/welcome/{name}")
	@ResponseBody
	public String sayWelcome(@PathVariable("name") String name){
	    return "Welcome "+name;
	}
	

}
