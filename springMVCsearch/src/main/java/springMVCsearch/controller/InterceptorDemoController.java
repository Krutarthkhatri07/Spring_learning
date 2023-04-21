package springMVCsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class InterceptorDemoController {

	@RequestMapping("/interceptor")
	public String homepage()
	{
		return "demo";
	}
	
	@RequestMapping("/welcome")
	public String welcomepage(@RequestParam("name") String name,Model model)
	{
		model.addAttribute("name", name);
		return "welcome";
	}
}
