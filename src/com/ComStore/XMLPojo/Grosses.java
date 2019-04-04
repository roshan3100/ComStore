package com.ComStore.XMLPojo;

import java.util.List;

import com.ComStore.XMLPojo.Gross.cume_gross;
import com.ComStore.XMLPojo.Gross.friday_gross;
import com.ComStore.XMLPojo.Gross.monday_gross;
import com.ComStore.XMLPojo.Gross.saturday_gross;
import com.ComStore.XMLPojo.Gross.sunday_gross;
import com.ComStore.XMLPojo.Gross.thursday_gross;
import com.ComStore.XMLPojo.Gross.tuesday_gross;
import com.ComStore.XMLPojo.Gross.wednesday_gross;
import com.ComStore.XMLPojo.Gross.week_gross;
import com.ComStore.XMLPojo.Gross.weekend_gross;

public class Grosses {
	friday_gross friday_gross;
	saturday_gross saturday_gross;
	sunday_gross sunday_gross;
	monday_gross monday_gross;
	tuesday_gross tuesday_gross;
	wednesday_gross wednesday_gross;
	thursday_gross thursday_gross;
	week_gross week_gross;
	weekend_gross weekend_gross;
	cume_gross cume_gross;
	
	public Grosses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grosses(com.ComStore.XMLPojo.Gross.friday_gross friday_gross,
			com.ComStore.XMLPojo.Gross.saturday_gross saturday_gross,
			com.ComStore.XMLPojo.Gross.sunday_gross sunday_gross, com.ComStore.XMLPojo.Gross.monday_gross monday_gross,
			com.ComStore.XMLPojo.Gross.tuesday_gross tuesday_gross,
			com.ComStore.XMLPojo.Gross.wednesday_gross wednesday_gross,
			com.ComStore.XMLPojo.Gross.thursday_gross thursday_gross, com.ComStore.XMLPojo.Gross.week_gross week_gross,
			com.ComStore.XMLPojo.Gross.weekend_gross weekend_gross, com.ComStore.XMLPojo.Gross.cume_gross cume_gross) {
		super();
		this.friday_gross = friday_gross;
		this.saturday_gross = saturday_gross;
		this.sunday_gross = sunday_gross;
		this.monday_gross = monday_gross;
		this.tuesday_gross = tuesday_gross;
		this.wednesday_gross = wednesday_gross;
		this.thursday_gross = thursday_gross;
		this.week_gross = week_gross;
		this.weekend_gross = weekend_gross;
		this.cume_gross = cume_gross;
	}

	public friday_gross getFriday_gross() {
		return friday_gross;
	}

	public void setFriday_gross(friday_gross friday_gross) {
		this.friday_gross = friday_gross;
	}

	public saturday_gross getSaturday_gross() {
		return saturday_gross;
	}

	public void setSaturday_gross(saturday_gross saturday_gross) {
		this.saturday_gross = saturday_gross;
	}

	public sunday_gross getSunday_gross() {
		return sunday_gross;
	}

	public void setSunday_gross(sunday_gross sunday_gross) {
		this.sunday_gross = sunday_gross;
	}

	public monday_gross getMonday_gross() {
		return monday_gross;
	}

	public void setMonday_gross(monday_gross monday_gross) {
		this.monday_gross = monday_gross;
	}

	public tuesday_gross getTuesday_gross() {
		return tuesday_gross;
	}

	public void setTuesday_gross(tuesday_gross tuesday_gross) {
		this.tuesday_gross = tuesday_gross;
	}

	public wednesday_gross getWednesday_gross() {
		return wednesday_gross;
	}

	public void setWednesday_gross(wednesday_gross wednesday_gross) {
		this.wednesday_gross = wednesday_gross;
	}

	public thursday_gross getThursday_gross() {
		return thursday_gross;
	}

	public void setThursday_gross(thursday_gross thursday_gross) {
		this.thursday_gross = thursday_gross;
	}

	public week_gross getWeek_gross() {
		return week_gross;
	}

	public void setWeek_gross(week_gross week_gross) {
		this.week_gross = week_gross;
	}

	public weekend_gross getWeekend_gross() {
		return weekend_gross;
	}

	public void setWeekend_gross(weekend_gross weekend_gross) {
		this.weekend_gross = weekend_gross;
	}

	public cume_gross getCume_gross() {
		return cume_gross;
	}

	public void setCume_gross(cume_gross cume_gross) {
		this.cume_gross = cume_gross;
	}
	
}
