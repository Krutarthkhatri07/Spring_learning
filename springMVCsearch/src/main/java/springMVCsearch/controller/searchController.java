package springMVCsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class searchController {

	@RequestMapping("/user/{userid}/{username}")
	public String getuserdetails(@PathVariable("userid") int id,@PathVariable("username") String uname)
	{
		System.out.println(id+":"+uname);
		return "home";
	}
	 
	@RequestMapping("/home")
	public String home()
	{
		
		return "home";
	}
	
	@RequestMapping("/errordemo")
	public String errordemo()
	{
		String s=null;
		System.out.println(s.length());
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
	//handling exception
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class})
//	public String exeptionHadlerNull(Model model)
//	{
//		model.addAttribute("msg", "null pointer exception occurred");
//		return "null_page";
//	}
//	
//	
//	@ExceptionHandler({NumberFormatException.class})
//	public String exeptionHadlerNumber()
//	{
//		return "null_page";
//	}
//	@ExceptionHandler({Exception.class})
//	public String exeptionHadlerException()
//	{
//		return "null_page";
//	}
}
