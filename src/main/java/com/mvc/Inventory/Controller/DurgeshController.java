//package com.mvc.Inventory.Controller;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.view.RedirectView;
//
//import com.mvc.Inventory.Dao.IssueProcessedItemDao;
//import com.mvc.Inventory.Model.IssueProcessedItem;
//
//
//@Controller
//public class DurgeshController {
//	
//	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
//	IssueProcessedItemDao issueIssueProcessedItemDao = (IssueProcessedItemDao) context.getBean("issueIssueProcessedItemDao");
//	@RequestMapping("/sucess")
//	public String add()
//	{
//		return "sucess";
//	}
//	@RequestMapping("/addIssueIssueProcessedItemDao")
//	public String addshhs()
//	{
//		return "addIssueProcessed";
//	}
//	
//	@RequestMapping("/addIsssueProcessedItem")
//	public RedirectView insertProcessedItem(@ModelAttribute IssueProcessedItem issueProcessedItem,HttpServletRequest request)
//	{
//
//		
//		
//		
//		
//		int r=issueIssueProcessedItemDao.insert(issueProcessedItem);
//		RedirectView redirectview=new RedirectView();
//		redirectview.setUrl(request.getContextPath()+"/viewProcessed");
//		return redirectview;
//		
//	}
//}
