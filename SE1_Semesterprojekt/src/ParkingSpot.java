
public class ParkingSpot {
	private static int numberOfParkingSpots = 10;
	private static int fullParkingSpots = 0;
	
	public ParkingSpot(int allParkingSpots) {
		numberOfParkingSpots = allParkingSpots;
	}
	
	//Returns the avaiable number of parking spots
	public static int avaiableParkingSpots ()
	{
		return numberOfParkingSpots-fullParkingSpots;
	}
	
	//Raise the number of full parking spots
	public static void raiseFullSpots (int i)
	{
		fullParkingSpots++;
	}
	
	//Lower the number of full parking spots
		public static void lowerFullSpots (int i)
		{
			fullParkingSpots--;
		}
	
	
}
