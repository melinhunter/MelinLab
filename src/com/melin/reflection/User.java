package com.melin.reflection;

public class User {
	String name = null;
	String id = null;
	String sex = null;
	String tel = null;
	String address = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", sex=" + sex + ", tel=" + tel + ", address=" + address + "]";
	}
	
	
}
