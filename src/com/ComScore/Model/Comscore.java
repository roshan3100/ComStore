package com.ComScore.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="comscore")
public class Comscore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comscore_id")
	private int comscore_id;
	
	@Column(name="ranking")
	private int ranking;
	
	@Column(name="booking_xref_title_no")
	private	 int booking_xref_title_no;
	
	@Column(name="title_name")
	private String title_name;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="distributor_name")
	private String distributor_name;
	
	@Column(name="release_nr")
	private int release_nr;
	
	@Column(name="created_date")
	private Date created_date;
	
	@Column(name="created_user_nr")
	private int created_user_nr;
	
	@Column(name="updated_date")
	private Date updated_date;
	
	@Column(name="updated_user_nr")
	private int updated_user_nr;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="comscore")
	private week_info week_info;

	public Comscore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getComscore_id() {
		return comscore_id;
	}

	public void setComscore_id(int comscore_id) {
		this.comscore_id = comscore_id;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getBooking_xref_title_no() {
		return booking_xref_title_no;
	}

	public void setBooking_xref_title_no(int booking_xref_title_no) {
		this.booking_xref_title_no = booking_xref_title_no;
	}

	public String getTitle_name() {
		return title_name;
	}

	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDistributor_name() {
		return distributor_name;
	}

	public void setDistributor_name(String distributor_name) {
		this.distributor_name = distributor_name;
	}

	public int getRelease_nr() {
		return release_nr;
	}

	public void setRelease_nr(int release_nr) {
		this.release_nr = release_nr;
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
	
	public week_info getWeek_info() {
		return week_info;
	}

	public void setWeek_info(week_info week_info) {
		this.week_info = week_info;
	}
}
