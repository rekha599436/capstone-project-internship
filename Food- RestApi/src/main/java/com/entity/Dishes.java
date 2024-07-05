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
@Table(name="Food_Dishes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dishes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int did;
	private String dname;
	private String dtype;
	private String vname;
	private int price;
	private String imgurl;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDtype() {
		return dtype;
	}
	public void setDtype(String dtype) {
		this.dtype = dtype;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	@Override
	public String toString() {
		return "Dishes [did=" + did + ", dname=" + dname + ", dtype=" + dtype + ", vname=" + vname + ", price=" + price
				+ ", imgurl=" + imgurl + "]";
	}
	public Dishes(int did, String dname, String dtype, String vname, int price, String imgurl) {
		super();
		this.did = did;
		this.dname = dname;
		this.dtype = dtype;
		this.vname = vname;
		this.price = price;
		this.imgurl = imgurl;
	}
	public Dishes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
