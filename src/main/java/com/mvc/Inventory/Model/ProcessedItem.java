package com.mvc.Inventory.Model;

import javax.persistence.Entity;
import javax.persistence.Id;



import org.springframework.stereotype.Component;
@Entity
@Component
public class ProcessedItem {
	
	@Id
	private int pid;
	private String proname;
	private int pquantity;
	private String punit;
	private int pcost;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	public String getPunit() {
		return punit;
	}
	public void setPunit(String punit) {
		this.punit = punit;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "ProcessedItem [pid=" + pid + ", proname=" + proname + ", pquantity=" + pquantity + ", punit=" + punit
				+ ", pcost=" + pcost + "]";
	}
	public ProcessedItem(int pid, String proname, int pquantity, String punit, int pcost) {
		super();
		this.pid = pid;
		this.proname = proname;
		this.pquantity = pquantity;
		this.punit = punit;
		this.pcost = pcost;
	}
	public ProcessedItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
