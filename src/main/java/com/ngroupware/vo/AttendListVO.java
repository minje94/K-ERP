package com.ngroupware.vo;

public class AttendListVO {
	
	private String a_date;
	private String u_id;
	private int g_no;
	private int a_flag;
	private String u_name;
	
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String a_date) {
		this.a_date = a_date;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public int getG_no() {
		return g_no;
	}
	public void setG_no(int g_no) {
		this.g_no = g_no;
	}
	public int getA_flag() {
		return a_flag;
	}
	public void setA_flag(int a_flag) {
		this.a_flag = a_flag;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	@Override
	public String toString() {
		return "AttendListVO [a_date=" + a_date + ", u_id=" + u_id + ", g_no=" + g_no 
					 + ", a_flag=" + a_flag + ", u_name=" + u_name + "]";
	}
}