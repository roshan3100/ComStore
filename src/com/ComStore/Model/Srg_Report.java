package com.ComStore.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="srg_report")
public class Srg_Report {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	String report_id;
	
	@Column(name="report_date")
	String report_date;
	
	@Column(name="creation_date")
	String creation_date;

	public Srg_Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Srg_Report(String report_id, String report_date, String creation_date) {
		super();
		this.report_id = report_id;
		this.report_date = report_date;
		this.creation_date = creation_date;
	}

	public String getReport_id() {
		return report_id;
	}

	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}

	public String getReport_date() {
		return report_date;
	}

	public void setReport_date(String report_date) {
		this.report_date = report_date;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}
}
