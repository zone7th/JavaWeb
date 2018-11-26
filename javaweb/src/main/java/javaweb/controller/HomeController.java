package javaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @Description: 主页
 * @author Martin
 * @date 2018年11月19日 下午5:22:36
 */

@Controller
@RequestMapping("/home")
public class HomeController {
	
	
	@RequestMapping(value = "/home")
	public String home(){
		return "home";
	}
	
}
