package com.ComScore.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="gross_info")
public class gross_info {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int day_gross_nr;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="week_id")
	week_info week_info;
	
	@Column(name="system_day_nr")
	int system_day_nr;
	
	@Column(name="locations")
	int locations;
	
	@Column(name="gross")
	int gross;
	
	@Column(name="week_pct_chg")
	double week_pct_chg;
	
	@Column(name="day_pct_chg")
	double day_pct_chg;
	
	@Column(name="created_date")
	Date created_date;
	
	@Column(name="created_user_nr")
	int created_user_nr;
	
	@Column(name="updated_date")
	Date updated_date;
	
	@Column(name="updated_user_nr")
	int updated_user_nr;

	public gross_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDay_gross_nr() {
		return day_gross_nr;
	}

	public void setDay_gross_nr(int day_gross_nr) {
		this.day_gross_nr = day_gross_nr;
	}

	public week_info getWeek_info() {
		return week_info;
	}

	public void setWeek_info(week_info week_info) {
		this.week_info = week_info;
	}

	public int getSystem_day_nr() {
		return system_day_nr;
	}

	public void setSystem_day_nr(int system_day_nr) {
		this.system_day_nr = system_day_nr;
	}

	public int getLocations() {
		return locations;
	}

	public void setLocations(int locations) {
		this.locations = locations;
	}

	public int getGross() {
		return gross;
	}

	public void setGross(int gross) {
		this.gross = gross;
	}

	public double getWeek_pct_chg() {
		return week_pct_chg;
	}

	public void setWeek_pct_chg(double week_pct_chg) {
		this.week_pct_chg = week_pct_chg;
	}

	public double getDay_pct_chg() {
		return day_pct_chg;
	}

	public void setDay_pct_chg(double day_pct_chg) {
		this.day_pct_chg = day_pct_chg;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public int getCreated_user_nr() {
		return created_user_nr;
	}

	public void setCreated_user_nr(int created_user_nr) {
		this.created_user_nr = created_user_nr;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public int getUpdated_user_nr() {
		return updated_user_nr;
	}

	public void setUpdated_user_nr(int updated_user_nr) {
		this.updated_user_nr = updated_user_nr;
	}
}
