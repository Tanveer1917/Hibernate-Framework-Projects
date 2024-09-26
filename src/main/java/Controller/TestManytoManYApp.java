package Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.mysql.cj.xdevapi.DbDoc;

import Model.Airport;
import Model.Flight;
import Utility.DBUtil;

public class TestManytoManYApp {

	public static void main(String[] args) {
	EntityManager em=	DBUtil.getEntityManager();
	em.getTransaction().begin();
		Flight flight1 = new Flight();
		flight1.setFlightsource("Mumbai");
		flight1.setFlightDestination("Pune");
		flight1.setFlightDate(LocalDate.now());
		
		Flight flight2 = new Flight();
		flight2.setFlightsource("Pune");
		flight2.setFlightDestination("Mumbai");
		flight2.setFlightDate(LocalDate.now());
		
		Airport airport1 = new Airport();
		airport1.setAirportName("Pune Airport");
		
		Airport airport2 = new Airport();
		airport2.setAirportName("Mumbai Airport");
		
		List<Flight> listofflight = airport1.getFlights();
		listofflight.add(flight1);
		listofflight.add(flight2);
		
		List<Flight> listofflight1 = airport2.getFlights();
		listofflight1.add(flight1);

		List<Airport> listofAirport1 = flight1.getAirport();
		listofAirport1.add(airport1);
		
		List<Airport> listofAirport2 = flight2.getAirport();
		listofAirport2.add(airport1);
		listofAirport2.add(airport2);
		
		flight1.setAirport(listofAirport1);
		flight2.setAirport(listofAirport2);
		
		airport1.setFlights(listofflight1);
		airport2.setFlights(listofflight);
		
		em.persist(flight1);
		em.persist(flight2);
		em.getTransaction().commit();

		
		
		
		
	}
}
