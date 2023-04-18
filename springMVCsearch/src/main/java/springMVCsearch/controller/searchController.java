package springMVCsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class searchController {

	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		RedirectView redirectView=new RedirectView();
		String url="http://www.google.com/search?q="+query;
		redirectView.setUrl(url);
		return redirectView;
	}
}
