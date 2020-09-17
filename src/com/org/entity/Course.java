package com.org.entity;

public class Course {
	
	private Integer cid;
	
	private String cname;

	public Course() {
		super();
	}
	
	

	public Course(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}



	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
}
