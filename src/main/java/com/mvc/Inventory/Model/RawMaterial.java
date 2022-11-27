package com.mvc.Inventory.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class RawMaterial {
	@Id
	private int id;
	private String pname;
	private int quantity;
	private String unit;
	private int cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "RawMaterial [id=" + id + ", pname=" + pname + ", quantity=" + quantity + ", unit=" + unit + ", cost="
				+ cost + "]";
	}
	public RawMaterial(int id, String pname, int quantity, String unit, int cost) {
		super();
		this.id = id;
		this.pname = pname;
		this.quantity = quantity;
		this.unit = unit;
		this.cost = cost;
	}
	public RawMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
