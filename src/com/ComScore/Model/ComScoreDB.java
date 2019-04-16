package com.ComScore.Model;

import java.util.Date;

public class ComScoreDB {
	
	private String Title;
	private String Dist;
	private Date Release_Date;
	private Date Gross_Date;
	private double Reported_Gross;
	private double Reported_Locs;
	public ComScoreDB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDist() {
		return Dist;
	}
	public void setDist(String dist) {
		Dist = dist;
	}
	public Date getRelease_Date() {
		return Release_Date;
	}
	public void setRelease_Date(Date release_Date) {
		Release_Date = release_Date;
	}
	public Date getGross_Date() {
		return Gross_Date;
	}
	public void setGross_Date(Date gross_Date) {
		Gross_Date = gross_Date;
	}
	public double getReported_Gross() {
		return Reported_Gross;
	}
	public void setReported_Gross(double reported_Gross) {
		Reported_Gross = reported_Gross;
	}
	public double getReported_Locs() {
		return Reported_Locs;
	}
	public void setReported_Locs(double reported_Locs) {
		Reported_Locs = reported_Locs;
	}
	
}
