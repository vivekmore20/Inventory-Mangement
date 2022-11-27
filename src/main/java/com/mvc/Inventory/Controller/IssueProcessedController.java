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

import com.mvc.Inventory.Dao.IssueProcessedItemDao;
import com.mvc.Inventory.Dao.ProcessedItemDao;
import com.mvc.Inventory.Model.IssueProcessedItem;
import com.mvc.Inventory.Model.ProcessedItem;


@Controller
public class IssueProcessedController {
	
	
	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	IssueProcessedItemDao rd = (IssueProcessedItemDao) context.getBean("issueProcessedItemDao");
	
	@RequestMapping("/addIssueProcessed")
	public String saveh()
	{
		return "issueProcessedItem";
	}
	
	
	@RequestMapping("/issueProcessed")
	public String durgesh()
	{
		return "issueProcessed";
	}
	
	@RequestMapping("/addIssueItem")
	public RedirectView insertIssueProcessed(@ModelAttribute IssueProcessedItem issueProcessedItem,HttpServletRequest request)
	{

		
		
		ProcessedItemDao p=(ProcessedItemDao) context.getBean("processedItemDao");
		int quan=issueProcessedItem.getQuantity();
		int itemid=issueProcessedItem.getItemId();
		System.out.println(quan);
		System.out.println(itemid);
		int vi=Integer.parseInt(request.getParameter("id"));
		ProcessedItem pm=p.get(Integer.parseInt(request.getParameter("itemId")));
		System.out.println(pm);
		
		if(pm.getPquantity()-quan>=0)
		{
			pm.setPquantity(pm.getPquantity()-quan);
			p.update(pm);
			int r=rd.insert(issueProcessedItem);
		}
		
		
		
		
		
		
			
			
		
	
		
		
		
		

		RedirectView redirectview=new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/viewIssueProcessed");
		return redirectview;
		
	}

	@RequestMapping("/viewIssueProcessed")
	public String viewIssueProcessed(Model m)
	{
		
		List<IssueProcessedItem> issueProcessedItem= rd.getAllIssueProcessedItemDao();
		m.addAttribute("issueProcessedItem",issueProcessedItem);
		return "viewIssueProcessed";
		
	}
}
