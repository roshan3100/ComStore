package com.ComStore.XMLPojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement
public class Srg_Report {
	
	private String report_date;
	private String creation_date;
	
	List<Title> title;
	
	public Srg_Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Srg_Report(String report_date, String creation_date, List<Title> title) {
		super();
		this.report_date = report_date;
		this.creation_date = creation_date;
		this.title = title;
	}
	
	@XmlElement
	public String getReport_date() {
		return report_date;
	}

	public void setReport_date(String report_date) {
		this.report_date = report_date;
	}
	
	@XmlElement
	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	@XmlElement
	public List<Title> getTitle() {
		return title;
	}

	public void setTitle(List<Title> title) {
		this.title = title;
	}
	
}
