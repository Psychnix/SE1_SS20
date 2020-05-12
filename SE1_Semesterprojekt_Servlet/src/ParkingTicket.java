import java.time.*;

public class ParkingTicket {
	private static int ticketNumber = 0;
	private static int ticketCategorie = 0;
    private static LocalDateTime ticketTime;

	
	public ParkingTicket(int iticketNumber, int iticketCategorie ) {
		ticketNumber = iticketNumber;
		ticketCategorie = iticketCategorie;
		ticketTime = LocalDateTime.now();
	}
	
	//Returns the ticket number
	public static int returnTicketNumber()
	{
		return ticketNumber;
	}
	
	//Returns the ticket categorie
	public static int returnTicketCategorie()
	{
		return ticketCategorie;
	}
	
	//Returns the ticket categorie
	public static LocalDateTime returnTicketTime()
	{
		return ticketTime;
	}
}
