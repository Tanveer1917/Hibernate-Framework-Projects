package Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Airport_info")
public class Airport {
	@Id
	@GeneratedValue
	private long airportId;
	private String airportName;
	@ManyToMany(mappedBy = "airport")
	private List<Flight> flights = new ArrayList<Flight>();
	public long getAirportId() {
		return airportId;
	}
	public void setAirportId(long airportId) {
		this.airportId = airportId;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
	

}
