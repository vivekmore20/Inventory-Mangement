package com.mvc.Inventory.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.Inventory.Model.IssueProcessedItem;


@Component
public class IssueProcessedItemDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(IssueProcessedItem issueProcessedItem)
	{
		Integer i= (Integer) this.hibernateTemplate.save(issueProcessedItem);
		return i;
	}
	public IssueProcessedItemDao get(int id)
	{
		IssueProcessedItemDao issueProcessedItemDao= this.hibernateTemplate.get(IssueProcessedItemDao.class,id);
		return issueProcessedItemDao;
	}
	public List<IssueProcessedItem> getAllIssueProcessedItemDao()
	{
		List<IssueProcessedItem> IssueProcessedItem = this.hibernateTemplate.loadAll(IssueProcessedItem.class);
		return IssueProcessedItem;
	}
	@Transactional
	public void deleteIssueProcessedItemDao(int IssueProcessedItemDaoid)
	{
		IssueProcessedItemDao issueProcessedItemDao=this.hibernateTemplate.get(IssueProcessedItemDao.class, IssueProcessedItemDaoid);
		this.hibernateTemplate.delete(issueProcessedItemDao);
	}
	@Transactional
	public void updateIssueProcessedItemDao(IssueProcessedItemDao issueProcessedItemDao)
	{
		this.hibernateTemplate.update(issueProcessedItemDao);
	}
	

}
