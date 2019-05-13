
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
@Table(name="week_info")
public class week_info {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="comscore_id")
	Comscore comscore;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JoinColumn(name="week_id")
	private int week_id;
	
	@Column(name="weeks_in_release")
	int weeks_in_release;
	
	@Column(name="locations_reporting")
	int locations_reporting;
	
	@Column(name="location_pct_chg")
	double location_pct_chg;
	
	@Column(name="location_week_avg")
	double location_week_avg;
	
	@Column(name="locations_upcoming")
	double locations_upcoming;
	
	@Column(name="prev_week_gross")
	double prev_week_gross;
	
	@Column(name="curr_week_gross")
	double curr_week_gross;
	
	@Column(name="cumulative_gross")
	double cumulative_gross;
	
	@Column(name="deleted")
	int deleted;
	
	@Column(name="approved")
	String Approved;
	
	@Column(name="rejected")
	String Rejected;
	
	@Column(name="created_date")
	Date created_date;
	
	@Column(name="Created_user_nr")
	int Created_user_nr;
	
	@Column(name="updated_date")
	Date updated_date;
	
	@Column(name="updated_user_nr")
	int updated_user_nr;

	@OneToOne(mappedBy="week_info", cascade= CascadeType.ALL)
	gross_info gross_info;
	
	public week_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public gross_info getGross_info() {
		return gross_info;
	}

	public void setGross_info(gross_info gross_info) {
		this.gross_info = gross_info;
	}

	public Comscore getComscore() {
		return comscore;
	}

	public void setComscore(Comscore comscore) {
		this.comscore = comscore;
	}

	public int getWeek_id() {
		return week_id;
	}

	public void setWeek_id(int week_id) {
		this.week_id = week_id;
	}

	public int getWeeks_in_release() {
		return weeks_in_release;
	}

	public void setWeeks_in_release(int weeks_in_release) {
		this.weeks_in_release = weeks_in_release;
	}

	public int getLocations_reporting() {
		return locations_reporting;
	}

	public void setLocations_reporting(int locations_reporting) {
		this.locations_reporting = locations_reporting;
	}

	public double getLocation_pct_chg() {
		return location_pct_chg;
	}

	public void setLocation_pct_chg(double location_pct_chg) {
		this.location_pct_chg = location_pct_chg;
	}

	public double getLocation_week_avg() {
		return location_week_avg;
	}

	public void setLocation_week_avg(double location_week_avg) {
		this.location_week_avg = location_week_avg;
	}

	public double getLocations_upcoming() {
		return locations_upcoming;
	}

	public void setLocations_upcoming(double locations_upcoming) {
		this.locations_upcoming = locations_upcoming;
	}

	public double getPrev_week_gross() {
		return prev_week_gross;
	}

	public void setPrev_week_gross(double prev_week_gross) {
		this.prev_week_gross = prev_week_gross;
	}

	public double getCurr_week_gross() {
		return curr_week_gross;
	}

	public void setCurr_week_gross(double curr_week_gross) {
		this.curr_week_gross = curr_week_gross;
	}

	public double getCumulative_gross() {
		return cumulative_gross;
	}

	public void setCumulative_gross(double cumulative_gross) {
		this.cumulative_gross = cumulative_gross;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public String getApproved() {
		return Approved;
	}

	public void setApproved(String approved) {
		Approved = approved;
	}

	public String getRejected() {
		return Rejected;
	}

	public void setRejected(String rejected) {
		Rejected = rejected;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public int getCreated_user_nr() {
		return Created_user_nr;
	}

	public void setCreated_user_nr(int created_user_nr) {
		Created_user_nr = created_user_nr;
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
