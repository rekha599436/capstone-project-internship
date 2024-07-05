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
@Table(name="Food_Admin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int admid;
	private String pass;
	public int getAdmid() {
		return admid;
	}
	public void setAdmid(int admid) {
		this.admid = admid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Admin [admid=" + admid + ", pass=" + pass + "]";
	}
	public Admin(int admid, String pass) {
		super();
		this.admid = admid;
		this.pass = pass;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
