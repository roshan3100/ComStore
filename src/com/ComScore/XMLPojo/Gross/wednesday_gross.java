package com.ComScore.XMLPojo.Gross;

public class wednesday_gross {
	
	String gross;
	String week_pct_chg;
	String day_pct_chg;
	public wednesday_gross() {
		super();
		// TODO Auto-generated constructor stub
	}
	public wednesday_gross(String gross, String week_pct_chg, String day_pct_chg) {
		super();
		this.gross = gross;
		this.week_pct_chg = week_pct_chg;
		this.day_pct_chg = day_pct_chg;
	}
	public String getGross() {
		return gross;
	}
	public void setGross(String gross) {
		this.gross = gross;
	}
	public String getWeek_pct_chg() {
		return week_pct_chg;
	}
	public void setWeek_pct_chg(String week_pct_chg) {
		this.week_pct_chg = week_pct_chg;
	}
	public String getDay_pct_chg() {
		return day_pct_chg;
	}
	public void setDay_pct_chg(String day_pct_chg) {
		this.day_pct_chg = day_pct_chg;
	}
	

}
