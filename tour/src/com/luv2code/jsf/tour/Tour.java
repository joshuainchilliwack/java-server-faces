package com.luv2code.jsf.tour;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Tour {

	private String kindOfTour;
	
	public Tour() {
		
	}
		
	public String getKindOfTour() {
		return kindOfTour;
	}

	public void setKindOfTour(String kindOfTour) {
		this.kindOfTour = kindOfTour;
	}

	public String startTheTour() {
		if (kindOfTour != null && kindOfTour.equals("city")) {
			return "city_tour";
		}
		else {
			return "country_tour";
		}
	}
}
