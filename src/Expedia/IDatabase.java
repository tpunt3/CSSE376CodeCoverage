package Expedia;

import java.util.List;

public abstract class IDatabase {

	public List<String> Passengers = null;
	public List<String> Rooms = null;
	public int Miles = 0;

	public abstract String getCarLocation(int carNumber);

	public abstract String getRoomOccupant(int roomNumber);
	
	public abstract List<String> getPassengers();

}
