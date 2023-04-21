package SpringProductCRUDapplication.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import SpringProductCRUDapplication.dao.ProductDao;
import SpringProductCRUDapplication.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model model)
	{
		List<Product> getallproduct = this.productDao.getallproduct();
		model.addAttribute("products", getallproduct);
		return "index";
	}
	@RequestMapping("/add-product")
	public String addproduct(Model model)
	{
		model.addAttribute("title", "Add Product");
		return "add_product_from";
	}
	@RequestMapping(path="/handler-product",method = RequestMethod.POST)
	public RedirectView handleproduct(@ModelAttribute Product product,HttpServletRequest request)
	{
		this.productDao.createProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteproduct(@PathVariable("productId") int pid, HttpServletRequest request)
	{
		this.productDao.deleteproduct(pid);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateproduct(@PathVariable("productId") int pid,Model model)
	{
		Product getproduct = this.productDao.getproduct(pid);
		model.addAttribute("product", getproduct);
		return "update_form";
	}

}
