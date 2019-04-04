package com.ComStore.XMLPojo.Gross;

public class week_gross {
	
	String prev_week_gross;
	String curr_week_gross;
	public week_gross() {
		super();
		// TODO Auto-generated constructor stub
	}
	public week_gross(String prev_week_gross, String curr_week_gross) {
		super();
		this.prev_week_gross = prev_week_gross;
		this.curr_week_gross = curr_week_gross;
	}
	public String getPrev_week_gross() {
		return prev_week_gross;
	}
	public void setPrev_week_gross(String prev_week_gross) {
		this.prev_week_gross = prev_week_gross;
	}
	public String getCurr_week_gross() {
		return curr_week_gross;
	}
	public void setCurr_week_gross(String curr_week_gross) {
		this.curr_week_gross = curr_week_gross;
	}

}
