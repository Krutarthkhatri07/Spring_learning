package springMVCsearch.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	//handling exception
		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler({NullPointerException.class})
		public String exeptionHadlerNull(Model model)
		{
			model.addAttribute("msg", "null pointer exception occurred");
			return "null_page";
		}
		
		
		@ExceptionHandler({NumberFormatException.class})
		public String exeptionHadlerNumber()
		{
			return "null_page";
		}
		@ExceptionHandler({Exception.class})
		public String exeptionHadlerException()
		{
			return "null_page";
		}

}
