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
@Table(name="Food_Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid; // Auto generated
	private String name; // Name 
	private String mobile;
	private String address;
	private String uname; //Username
	private String pass;    
	private String SecQue;   //Security Question 
	private String SecAns;   //Security Answer
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
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
		return "User [uid=" + uid + ", name=" + name + ", mobile=" + mobile + ", address=" + address + ", uname="
				+ uname + ", pass=" + pass + ", SecQue=" + SecQue + ", SecAns=" + SecAns + "]";
	}
	public User(int uid, String name, String mobile, String address, String uname, String pass, String secQue,
			String secAns) {
		super();
		this.uid = uid;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.uname = uname;
		this.pass = pass;
		SecQue = secQue;
		SecAns = secAns;
	}
	public User() {
		super();
	}
	
	
	

}
