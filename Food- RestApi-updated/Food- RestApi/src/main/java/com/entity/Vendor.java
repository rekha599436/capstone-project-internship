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
@Table(name="Food_Vendors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vid; //Vendon id(Auto gen no need to create field)
	private String name;
	private String mobile;
	private String city;
	private String vuname;  // vendor user name
	private String pass;    
	private String SecQue;
	private String SecAns;
	public int getVid() {
		return vid;
	}
	
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getVuname() {
		return vuname;
	}
	public void setVuname(String vuname) {
		this.vuname = vuname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getSecQue() {
		return SecQue;
	}
	public void setSecQue(String secQue) {
		SecQue = secQue;
	}
	public String getSecAns() {
		return SecAns;
	}
	public void setSecAns(String secAns) {
		SecAns = secAns;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", name=" + name + ", mobile=" + mobile + ", city=" + city + ", vuname=" + vuname
				+ ", pass=" + pass + ", SecQue=" + SecQue + ", SecAns=" + SecAns + "]";
	}
	public Vendor(int vid, String name, String mobile, String city, String vuname, String pass, String secQue,
			String secAns) {
		super();
		this.vid = vid;
		this.name = name;
		this.mobile = mobile;
		this.city = city;
		this.vuname = vuname;
		this.pass = pass;
		SecQue = secQue;
		SecAns = secAns;
	}
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
