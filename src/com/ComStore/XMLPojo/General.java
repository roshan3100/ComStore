package com.ComStore.XMLPojo;

public class General {

	String ranking;
	String booking_xref_title_no;
	String title_name;
	String eidr_title_id;
	String short_name;
	String rating;
	String distributor_name;
	String weeks_in_release;
	
	
	public General() {
		super();
		// TODO Auto-generated constructor stub
	}

	public General(String ranking, String booking_xref_title_no, String title_name, String eidr_title_id,
			String short_name, String rating, String distributor_name, String weeks_in_release) {
		super();
		this.ranking = ranking;
		this.booking_xref_title_no = booking_xref_title_no;
		this.title_name = title_name;
		this.eidr_title_id = eidr_title_id;
		this.short_name = short_name;
		this.rating = rating;
		this.distributor_name = distributor_name;
		this.weeks_in_release = weeks_in_release;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getBooking_xref_title_no() {
		return booking_xref_title_no;
	}

	public void setBooking_xref_title_no(String booking_xref_title_no) {
		this.booking_xref_title_no = booking_xref_title_no;
	}

	public String getTitle_name() {
		return title_name;
	}

	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}

	public String getEidr_title_id() {
		return eidr_title_id;
	}

	public void setEidr_title_id(String eidr_title_id) {
		this.eidr_title_id = eidr_title_id;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
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

	public String getWeeks_in_release() {
		return weeks_in_release;
	}

	public void setWeeks_in_release(String weeks_in_release) {
		this.weeks_in_release = weeks_in_release;
	}
	
}
