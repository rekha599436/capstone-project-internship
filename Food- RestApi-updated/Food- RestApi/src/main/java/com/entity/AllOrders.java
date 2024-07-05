package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Food_AllOrders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllOrders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int oid;
	private String uname;
	private String vname;
	private String dname;
	private String dadress;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDadress() {
		return dadress;
	}
	public void setDadress(String dadress) {
		this.dadress = dadress;
	}
	@Override
	public String toString() {
		return "AllOrders [oid=" + oid + ", uname=" + uname + ", vname=" + vname + ", dname=" + dname + ", dadress="
				+ dadress + "]";
	}
	public AllOrders(int oid, String uname, String vname, String dname, String dadress) {
		super();
		this.oid = oid;
		this.uname = uname;
		this.vname = vname;
		this.dname = dname;
		this.dadress = dadress;
	}
	public AllOrders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
	