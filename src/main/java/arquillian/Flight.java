package arquillian;

import java.util.HashSet;
import java.util.Set;

public class Flight {
	private String flightNumber;
	private int seats;
	Set<Passenger> passengers = new HashSet<Passenger>();

	public Flight(String flightNumber, int seats) {
		super();
		this.flightNumber = flightNumber;
		this.seats = seats;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public int getSeats() {
		return seats;
	}

	public int getPassengers() {
		return passengers.size();
	}

	public void setSeats(int seats) {
		if (passengers.size() > seats) {
			throw new RuntimeException(
					"Cannot reduce seats under the number of existing passengers!");
		}
		this.seats = seats;
	}

	public boolean addPassenger(Passenger passenger) {
		if (passengers.size() >= seats) {
			throw new RuntimeException(
					"Cannot add more passengers than the capacity of the flight!");

		}
		return passengers.add(passenger);
	}

	public boolean removePassenger(Passenger passenger) {
		return passengers.remove(passenger);
	}

	@Override
	public String toString() {
		return "Flight " + getFlightNumber();
	}

}
