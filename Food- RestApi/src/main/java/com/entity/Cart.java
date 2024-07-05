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
@Table(name="Food_Cart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Crtid;
	private String uname;
	private String vname;
	private String dname;
	private String ppu;
	private String imgurl;
	public int getCrtid() {
		return Crtid;
	}
	public void setCrtid(int crtid) {
		Crtid = crtid;
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
	public String getPpu() {
		return ppu;
	}
	public void setPpu(String ppu) {
		this.ppu = ppu;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	@Override
	public String toString() {
		return "Cart [Crtid=" + Crtid + ", uname=" + uname + ", vname=" + vname + ", dname=" + dname + ", ppu=" + ppu
				+ ", imgurl=" + imgurl + "]";
	}
	public Cart(int crtid, String uname, String vname, String dname, String ppu, String imgurl) {
		super();
		Crtid = crtid;
		this.uname = uname;
		this.vname = vname;
		this.dname = dname;
		this.ppu = ppu;
		this.imgurl = imgurl;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	

}
