package com.mvc.Inventory.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.mvc.Inventory.Dao.IssueRawMaterialDao;
import com.mvc.Inventory.Dao.RawMaterialDao;
import com.mvc.Inventory.Model.IssueRawMaterial;
import com.mvc.Inventory.Model.ProcessedItem;
import com.mvc.Inventory.Model.RawMaterial;
import com.mvc.Inventory.Model.IssueRawMaterial;

@Controller
public class IssueRawMaterialController {
	
	
	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	
	IssueRawMaterialDao rm1= (IssueRawMaterialDao)context.getBean("issueRawMaterialDao");
	
	
	@RequestMapping("/issueRaw")
	public String add()
	{
		return "issueRaw";
	}
	
	@RequestMapping("/addIssueRaw")
	public RedirectView insertIssueRawMaterial(@ModelAttribute IssueRawMaterial issueRawMaterial,HttpServletRequest request)
	{

//		
//		int quan=Integer.parseInt(request.getParameter("quantity"));
//		int id=Integer.parseInt(request.getParameter("id"));
//		
//		IssueRawMaterial rawupdate = rm.get(id);
//		rawupdate.setQuantity(rawupdate.getQuantity()-quan);
//		rm.updateIssueRawMaterial(rawupdate);
		RawMaterialDao rm= (RawMaterialDao)context.getBean("rawMaterialDao");
		int quan=issueRawMaterial.getQuantity();
		int id=issueRawMaterial.getItemId();
		RawMaterial rv= rm.get(id);
		if(rv.getQuantity()-quan>=0)
		{
			rv.setQuantity(rv.getQuantity()-quan);
			rm.update(rv);
			int r=rm1.insert(issueRawMaterial);
		
		}
		
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/viewIssueRaw");
		return redirectview;
		
	}
	@RequestMapping("/viewIssueRaw")
	public String viewIssueRaw(Model m)
	{
		
		List<IssueRawMaterial> issueRawMaterial= rm1.getAllIssueRawMaterial();
		m.addAttribute("issueRawMaterial",issueRawMaterial);
		return "viewIssueRaw";
		
	}


}
