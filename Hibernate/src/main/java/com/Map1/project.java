package com.Map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class project {
	@Id
private int pId;
	@Column(name="Project_Name")
	
private String pName;
	@ManyToMany(mappedBy = "projects",fetch = FetchType.EAGER)
private List<Emp> empolye;
	public project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public project(int pId, String pName, List<Emp> empolye) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.empolye = empolye;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<Emp> getEmpolye() {
		return empolye;
	}
	public void setEmpolye(List<Emp> empolye) {
		this.empolye = empolye;
	}
	@Override
	public String toString() {
		return "project [pId=" + pId + ", pName=" + pName + ", empolye=" + empolye + "]";
	}
	
}
