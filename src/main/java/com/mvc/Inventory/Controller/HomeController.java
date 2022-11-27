package com.mvc.Inventory.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.Inventory.Dao.RawMaterialDao;
import com.mvc.Inventory.Model.RawMaterial;


@Controller
public class HomeController {

	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	RawMaterialDao rm= (RawMaterialDao)context.getBean("rawMaterialDao");
	@RequestMapping("/")
	public String home()
	{

	return "index";
	}
	
	
	@RequestMapping("/index")
	public String login()
	{
		
		return "index";
	}
	
	@RequestMapping(path="/index",method=RequestMethod.POST)
	public String afterlogin(Model m,HttpServletRequest request)
	{		
	String name=request.getParameter("name");
	
	
	String pass=request.getParameter("pass");
	


	if(name.equals("vivek") && pass.equals("sonu"))
	{
		return "issueProcessed";
	}
	return "fail";
	
	
	
}
	
	
	
	
}
