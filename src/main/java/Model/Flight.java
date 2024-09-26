package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "flight_Table1")
public class Flight {
	@Id
	@SequenceGenerator(name = "seq_gen",initialValue = 8000,allocationSize = 1)
	@GeneratedValue( generator = "seq_gen",strategy = GenerationType.SEQUENCE)
	@Column(name = "flight_no")
	private long flightNumber;
	@Column(name = "flight_source")
	private String flightsource;
	@Column(name = "flight_Dest")
	private String flightDestination;
	@Column(name = "flight_Date")
	private LocalDate flightDate;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "flight_airpot_table",
	
	//for Join Table Column Name
	//*************{ Current Table Primary Column}**********************{Referance table primary Column}
	joinColumns = {@JoinColumn(name="flight_id")},inverseJoinColumns = {@JoinColumn(name="airport_id")})
	private List<Airport> airport = new ArrayList<Airport>();

	public long getFlightNuber() {
		return flightNumber;
	}

	public void setFlightNuber(long flightNuber) {
		this.flightNumber = flightNuber;
	}

	public String getFlightsource() {
		return flightsource;
	}

	public void setFlightsource(String flightsource) {
		this.flightsource = flightsource;
	}

	public String getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public List<Airport> getAirport() {
		return airport;
	}

	public void setAirport(List<Airport> airport) {
		this.airport = airport;
	}
	
	
	
}
