package com.mvc.Inventory.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity
@Component
public class IssueRawMaterial {
	@Id
	private int id;
	private String name;
	private int quantity;
	private String issuerName;
	private int itemId;
	private String date;
	private String status;
	
	public IssueRawMaterial(int id, String name, int quantity, String issuerName, int itemId, String date,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.issuerName = issuerName;
		this.itemId = itemId;
		this.date = date;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "IssueRawMaterial [id=" + id + ", name=" + name + ", quantity=" + quantity + ", issuerName=" + issuerName
				+ ", itemId=" + itemId + ", date=" + date + "]";
	}
	
	public IssueRawMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
