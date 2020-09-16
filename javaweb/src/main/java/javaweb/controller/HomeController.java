package javaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


	@RequestMapping(value = "/pddtestpoint")
	@ResponseBody
	public String pddtestpoint(){

		String str = "{\"logistics_ticket_notify_response\":{\"is_success\":true,\"request_id\":\"16002516721957065\"}}";
//		PddTicketNotifyOutput  ss = new PddTicketNotifyOutput();
//		PddTicketNotifyOutput.TicketNotifyResponse s = new PddTicketNotifyOutput.TicketNotifyResponse();
//		s.setSuccess(true);
//		ss.setTicketNotifyResponse(s);
		return str;
	}


	@RequestMapping(value = "/cntestpoint")
	@ResponseBody
	public String cntestpoint(){
		String str = "{\"success\":\"true\"}";
//		CnGatewayResponse cc = new CnGatewayResponse();
//		cc.setSuccess(true);
		return str;
	}





	
}
