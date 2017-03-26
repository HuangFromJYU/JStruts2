package edu.jyu.action;

import edu.jyu.context.ActionContext;

public class HelloAction {
	
	private String name;
	private Integer year;
	
	public String execute(){
		//将year放到request域中
		ActionContext.getContext().getRequest().setAttribute("year", year);
		//将name放到request域中
		ActionContext.getContext().getRequest().setAttribute("name", name);
		//将Jason字符串放到request域中
		//ActionContext.getContext().getRequest().setAttribute("name", "Jason");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
}	
