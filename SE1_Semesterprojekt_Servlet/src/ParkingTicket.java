import java.time.*;

public class ParkingTicket {
	private static int ticketNumber = 0;
	private static int ticketCategorie = 0;
    private static LocalDateTime ticketTime;
    private static String[][] tickets = new String[2][6];
	
	public void newEnter(String[] splitBody) {
		if(Integer.valueOf(splitBody[1]) > tickets.length-1) {
			expandArray();
		}
		//Enter-Nummer
		System.out.println(splitBody[1]);
		tickets[Integer.valueOf(splitBody[1])][0] = splitBody[1];
		//Ticket-ID
		tickets[Integer.valueOf(splitBody[1])][1] = splitBody[5];
		//Datum & Uhrzeit
		tickets[Integer.valueOf(splitBody[1])][2] = splitBody[2];
		//Fahrzeugfarbe
		tickets[Integer.valueOf(splitBody[1])][5] = splitBody[6];
	}
	
	public void newLeave(String[] splitBody) {
		//Aufenthaltsdauer
		tickets[Integer.valueOf(splitBody[1])][3] = splitBody[3];
		//Preis
		tickets[Integer.valueOf(splitBody[1])][4] = splitBody[4];
	}
	
	public String[] getTicket(String enterNumber) {
		return tickets[Integer.valueOf(enterNumber)];
	}
	
	private static String[][] expandArray(){
		String[][]temp = new String[tickets.length*2][6];
		
		for(int i=0; i<tickets.length; i++) {
			for(int j=0; j<tickets[0].length; j++) {
				temp[i][j] = tickets[i][j];
			}
		}
		tickets = temp;
		
		return tickets;
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
