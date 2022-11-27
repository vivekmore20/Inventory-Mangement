package com.mvc.Inventory.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.mvc.Inventory.Dao.ProcessedItemDao;
import com.mvc.Inventory.Model.ProcessedItem;
import com.mvc.Inventory.Model.ProcessedItem;


@Controller
public class ProcessedItemController {
	
	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	ProcessedItemDao processedItemDao = (ProcessedItemDao) context.getBean("processedItemDao");
	
	@RequestMapping("/dashboard123")
	public String add()
	{
		return "dashboard123";
	}
	
	@RequestMapping("/addProcessedItem")
	public RedirectView insertProcessedItem(@ModelAttribute ProcessedItem processedItem,HttpServletRequest request)
	{

		
		
		
		
		int r=processedItemDao.insert(processedItem);
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/viewProcessed");
		return redirectview;
		
	}
	@RequestMapping("/viewProcessed")
	public String viewProcessed(Model m)
	{
		
		List<ProcessedItem> processedItem= processedItemDao.getAllProcessedItem();
		m.addAttribute("processedItem",processedItem);
		return "viewProcessed";
		
	}

	

	@RequestMapping(path="/deleteItem/{id}",method=RequestMethod.GET)
	public RedirectView deleteProcessed(@PathVariable("id") int id, HttpServletRequest request)
	{
		processedItemDao.deleteProcessedItem(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewProcessed");
		return redirectView;
	}

	
	@RequestMapping(value="/updateItem",method=RequestMethod.GET)
	public String updateProcessedItem(@RequestParam int id,Model m)
	{
		m.addAttribute("id",id);
		return "updateItem";
	}
	

	@RequestMapping("/updateProcessedItem")
	public RedirectView updateItem(HttpServletRequest request)
	{
		System.out.println( Integer.parseInt(request.getParameter("quantity")));
		System.out.println((request.getParameter("id")));
		int quan=Integer.parseInt(request.getParameter("quantity"));
		int id=Integer.parseInt(request.getParameter("id"));
		
		ProcessedItem rawupdate = processedItemDao.get(id);
		rawupdate.setPquantity(rawupdate.getPquantity()+quan);
		processedItemDao.update(rawupdate);
		
		RedirectView rv=new RedirectView();
		rv.setUrl(request.getContextPath()+"/viewProcessed");
		return rv;
	}
	
	@RequestMapping(value="/issueProcessedItem",method=RequestMethod.GET)
	public String issueProcessedItem(@RequestParam int id,Model m)
	{
		m.addAttribute("id",id);
		return "issueProcessedItem";
	}
	
	@RequestMapping("/issueProc")
	public RedirectView issueRawMat(HttpServletRequest request)
	{
		int quan=Integer.parseInt(request.getParameter("quantity"));
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		ProcessedItem rawupdate = processedItemDao.get(id);
		if(quan<=rawupdate.getPquantity())
		{
		rawupdate.setPquantity(rawupdate.getPquantity()-quan);
		processedItemDao.update(rawupdate);
		}
		RedirectView rv=new RedirectView();
		rv.setUrl(request.getContextPath()+"/viewRaw");
		return rv;
	}
	

}
