package com.latam.certification.models;

public class SearchDataFlight {
	
	private String origin;
	private String destination;
	private String flightTypes;
	private String departureDate;
	private int adultPassengers;
	private int childrenPassengers;
	private int babyPassengers;
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getFlightTypes() {
		return flightTypes;
	}
	public void setFlightTypes(String flighTypes) {
		this.flightTypes = flighTypes;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public int getAdultPassengers() {
		return adultPassengers;
	}
	public void setAdultPassengers(int adultPassengers) {
		this.adultPassengers = adultPassengers;
	}
	public int getChildrenPassengers() {
		return childrenPassengers;
	}
	public void setChildrenPassengers(int childrenPassengers) {
		this.childrenPassengers = childrenPassengers;
	}
	public int getBabyPassengers() {
		return babyPassengers;
	}
	public void setBabyPassengers(int babyPassengers) {
		this.babyPassengers = babyPassengers;
	}


}
