package com.mvc.Inventory.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.Inventory.Model.ProcessedItem;
@Component
public class ProcessedItemDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(ProcessedItem processedItem)
	{
		Integer i= (Integer) this.hibernateTemplate.save(processedItem);
		return i;
	}
	public ProcessedItem get(int id)
	{
		ProcessedItem processedItem= this.hibernateTemplate.get(ProcessedItem.class,id);
		return processedItem;
	}
	public List<ProcessedItem> getAllProcessedItem()
	{
		List<ProcessedItem> ProcessedItems = this.hibernateTemplate.loadAll(ProcessedItem.class);
		return ProcessedItems;
	}
	@Transactional
	public void deleteProcessedItem(int ProcessedItemid)
	{
		ProcessedItem processedItem=this.hibernateTemplate.get(ProcessedItem.class, ProcessedItemid);
		this.hibernateTemplate.delete(processedItem);
	}
	@Transactional
	public void update(ProcessedItem processedItem)
	{
		this.hibernateTemplate.update(processedItem);
	}


}
