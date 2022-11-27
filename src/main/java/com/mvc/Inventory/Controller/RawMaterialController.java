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
import com.mvc.Inventory.Dao.RawMaterialDao;
import com.mvc.Inventory.Model.ProcessedItem;
import com.mvc.Inventory.Model.RawMaterial;


@Controller
public class RawMaterialController {
	
	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	
	RawMaterialDao rm= (RawMaterialDao)context.getBean("rawMaterialDao");
	
	@RequestMapping("/dashboard")
	public String add()
	{
		return "dashboard";
	}
	
	@RequestMapping(path="/addRawMaterial")
	public RedirectView insertRawMaterial(@ModelAttribute RawMaterial rawMaterial,HttpServletRequest request)
	{
//		RawMaterial s = context.getBean("rawMaterial", RawMaterial.class);
//		s.setId(4);
//		s.setPname("plastic");
//		s.setQuantity(23);
//		s.setUnit("kg");
//		s.setCost(2000);
		int r=rm.insert(rawMaterial);
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/viewRaw");
		return redirectview;
			
	}
	@RequestMapping("/viewRaw")
	public String viewRaw(Model m)
	{
		
		List<RawMaterial> rawMaterial= rm.getAllRawMaterial();
		m.addAttribute("rawMaterial",rawMaterial);
		return "viewRaw";
		
	}
	@RequestMapping(path="/delete/{id}",method=RequestMethod.GET)
	public RedirectView deleteRawMaterial(@PathVariable("id") int id, HttpServletRequest request)
	{
		rm.deleteRawMaterial(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewRaw");
		return redirectView;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String updateRawMaterial(@RequestParam int id,Model m)
	{
		m.addAttribute("id",id);
		return "update";
	}
	
//	@RequestMapping(value="/updateRawMaterial",method=RequestMethod.GET)
//	public String updateRaw(HttpServletRequest request)
//	{
////		RawMaterial s=(RawMaterial) context.getBean("rawMaterial");
//		
//		System.out.println(request.getParameter("quantity"));
//		
//		return "viewRaw";
//	}
	@RequestMapping("/updateRawMaterial")
	public RedirectView updateRawMat(HttpServletRequest request)
	{
		int quan=Integer.parseInt(request.getParameter("quantity"));
		int id=Integer.parseInt(request.getParameter("id"));
		
		RawMaterial rawupdate = rm.get(id);
		rawupdate.setQuantity(rawupdate.getQuantity()+quan);
		rm.update(rawupdate);
		
		RedirectView rv=new RedirectView();
		rv.setUrl(request.getContextPath()+"/viewRaw");
		return rv;
	}
	
	@RequestMapping(value="/issueRawMaterial",method=RequestMethod.GET)
	public String issueRawMaterial(@RequestParam int id,Model m)
	{
		m.addAttribute("id",id);
		return "issueRawMaterial";
	}
	
	@RequestMapping("/issueRawMat")
	public RedirectView issueRawMat(HttpServletRequest request)
	{
		int quan=Integer.parseInt(request.getParameter("quantity"));
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		RawMaterial rawupdate = rm.get(id);
		if(quan<=rawupdate.getQuantity())
		{
		rawupdate.setQuantity(rawupdate.getQuantity()-quan);
		rm.update(rawupdate);
		}
		RedirectView rv=new RedirectView();
		rv.setUrl(request.getContextPath()+"/viewRaw");
		return rv;
	}
	
	
	@RequestMapping("/add1")
	public String addu()
	{
		return "sucess";
	}
	
	
	
	
	
	
	
	
//	@RequestMapping("/addProcessedItem")
//	public String insertProcessedItem()
//	{ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
//	ProcessedItemDao processedItemDao = (ProcessedItemDao) context.getBean("processedItemDao");
//	
//	System.out.println("Durgesh");
//	ProcessedItem s = context.getBean("processedItem", ProcessedItem.class);
//	s.setPid(4);
//	s.setProname("plastic");
//	s.setPquantity(23);
//	s.setPunit("kg");
//	s.setPcost(2000);
//	processedItemDao.insert(s);
////		RedirectView redirectview=new RedirectView();
////		redirectview.setUrl(request.getContextPath()+"/viewProcessed");
////		return redirectview;
//		return "sucess";
//			
//	}


	@RequestMapping("/unavailableitems")
	public String unavailable(Model m)
	{
		ProcessedItemDao processedItemDao = (ProcessedItemDao) context.getBean("processedItemDao");
		List<RawMaterial> rawMaterial= rm.getAllRawMaterial();
		m.addAttribute("rawMaterial",rawMaterial);

		List<ProcessedItem> processedItem= processedItemDao.getAllProcessedItem();
		m.addAttribute("processedItem",processedItem);
		return "unavailableitems";
	}
	

}
