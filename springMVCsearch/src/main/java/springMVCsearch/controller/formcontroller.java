package springMVCsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVCsearch.entities.Student;

@Controller
public class formcontroller {

	@RequestMapping("/complex")
	public String showform()
	{
		return "complex_form";
	}
	@RequestMapping(path = "/registration",method = RequestMethod.POST)
	public String registrationform(@ModelAttribute Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complex_form";
		}
		return "success";
	}
}
