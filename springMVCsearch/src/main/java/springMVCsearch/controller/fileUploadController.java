package springMVCsearch.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class fileUploadController {

	@RequestMapping("fileform")
	public String showUloadForm()
	{
		return "fileform";
	}
	
	@RequestMapping(path= "/uploadimage",method = RequestMethod.POST)
	public String fileupload(@RequestParam("profilename") CommonsMultipartFile file,HttpSession session,Model model)
	{
		System.out.println("in upload file");
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		System.out.println(file.getStorageDescription());
		byte[] data = file.getBytes();
		//we have to save this file to server
		String path=session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator +"resources"+File.separator +"image"+File.separator +file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			fos.close();
			model.addAttribute("filename",file.getOriginalFilename());
			model.addAttribute("msg", "uploaded sucesfully");
			System.out.println("file uploaded");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("msg", "uploading error");
			System.out.println("uploading error...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "filesuccess";
	}
}
	