package com.mvc.Inventory.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.Inventory.Model.IssueRawMaterial;

@Component
public class IssueRawMaterialDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(IssueRawMaterial issueRawMaterialDao)
	{
		Integer i= (Integer) this.hibernateTemplate.save(issueRawMaterialDao);
		return i;
	}
	public IssueRawMaterial get(int id)
	{
		IssueRawMaterial issueRawMaterialDao= this.hibernateTemplate.get(IssueRawMaterial.class,id);
		return issueRawMaterialDao;
	}
	public List<IssueRawMaterial> getAllIssueRawMaterial()
	{
		List<IssueRawMaterial> IssueRawMaterials = this.hibernateTemplate.loadAll(IssueRawMaterial.class);
		return IssueRawMaterials;
	}
	@Transactional
	public void deleteIssueRawMaterial(int IssueRawMaterialid)
	{
		IssueRawMaterial issueRawMaterialDao=this.hibernateTemplate.get(IssueRawMaterial.class, IssueRawMaterialid);
		this.hibernateTemplate.delete(issueRawMaterialDao);
	}
	@Transactional
	public void updateIssueRawMaterial(IssueRawMaterial issueRawMaterialDao)
	{
		this.hibernateTemplate.update(issueRawMaterialDao);
	}
	
	
}
