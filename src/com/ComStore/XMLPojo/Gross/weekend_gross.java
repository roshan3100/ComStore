package com.ComStore.XMLPojo.Gross;

public class weekend_gross {
	
	String gross;
	String weekend_pct_chg;
	public weekend_gross() {
		super();
		// TODO Auto-generated constructor stub
	}
	public weekend_gross(String gross, String weekend_pct_chg) {
		super();
		this.gross = gross;
		this.weekend_pct_chg = weekend_pct_chg;
	}
	public String getGross() {
		return gross;
	}
	public void setGross(String gross) {
		this.gross = gross;
	}
	public String getWeekend_pct_chg() {
		return weekend_pct_chg;
	}
	public void setWeekend_pct_chg(String weekend_pct_chg) {
		this.weekend_pct_chg = weekend_pct_chg;
	}
	

}
