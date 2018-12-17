package com.luv2code.springdemo.model;

public class CreateBlog {
	public String writeBlog;

	public String getWriteBlog() {
		return writeBlog;
	}
	
	public CreateBlog()
	{
		
	}

	public CreateBlog(String writeBlog) {
		
		this.writeBlog = writeBlog;
	}

	public void setWriteBlog(String writeBlog) {
		this.writeBlog = writeBlog;
	}

	@Override
	public String toString() {
		return "CreateBlog [writeBlog=" + writeBlog + "]";
	}

}
