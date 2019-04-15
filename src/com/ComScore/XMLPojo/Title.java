package com.ComScore.XMLPojo;

public class Title {
	
	General general;
	Locations locations;
	Grosses grosses;
	
	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Title(General general, Locations locations, Grosses grosses) {
		super();
		this.general = general;
		this.locations = locations;
		this.grosses = grosses;
	}

	public Title(General general, Locations locations) {
		super();
		this.general = general;
		this.locations = locations;
	}

	public Title(General general, Grosses grosses) {
		super();
		this.general = general;
		this.grosses = grosses;
	}

	public Title(Locations locations, Grosses grosses) {
		super();
		this.locations = locations;
		this.grosses = grosses;
	}

	public Title(General general) {
		super();
		this.general = general;
	}

	public Title(Grosses grosses) {
		super();
		this.grosses = grosses;
	}

	public Title(Locations locations) {
		super();
		this.locations = locations;
	}

	public General getGeneral() {
		return general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

	public Locations getLocations() {
		return locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	public Grosses getGrosses() {
		return grosses;
	}

	public void setGrosses(Grosses grosses) {
		this.grosses = grosses;
	}

}
