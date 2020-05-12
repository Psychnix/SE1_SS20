
public class ParkingSpot {
	private  int numberOfParkingSpots = 0;
	private  int parkingSpotCategorie = 0;
	private  int fullParkingSpots = 0;
	
	public ParkingSpot(int allParkingSpots,int iparkingSpotCategorie) {
		numberOfParkingSpots = allParkingSpots;
		parkingSpotCategorie = iparkingSpotCategorie;
	}
	
	//Returns the avaiable number of parking spots
	public int avaiableParkingSpots ()
	{
		return numberOfParkingSpots-fullParkingSpots;
	}
	
	//Returns the categorie of the parking spots
	public int categorieParkingSpots ()
	{
		return parkingSpotCategorie;
	}
	
	//Raise the number of full parking spots
	public int raiseFullSpots ()
	{
		return fullParkingSpots++;
	}
	
	//Lower the number of full parking spots
	public int lowerFullSpots ()
	{
		return fullParkingSpots--;
	}
	
	
}
