import static org.junit.jupiter.api.Assertions.*;

import java.time.*;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class FirstTests {

	//test for the calss Parking Ticket
		@Test 
		void test_ParkingTicket() {
			LocalDateTime ticketTime = LocalDateTime.now();
			ParkingTicket ticket = new ParkingTicket(1,0);
			int result = ticket.returnTicketCategorie();
			assertEquals(0, result);
			result = ticket.returnTicketNumber();
			assertEquals(1, result);
			LocalDateTime timeresult = ticket.returnTicketTime();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String dateTimeString = ticketTime.format(formatter);  //2019-03-28 14:47:33
			String dateTimeString2 = timeresult.format(formatter);  //2019-03-28 14:47:33
			assertEquals(dateTimeString2, dateTimeString);
		}
		//test for the class ParkingSpot
		@Test 
		void test_ParkingSpot() {
			ParkingSpot spot = new ParkingSpot(25,1);
			int result = spot.categorieParkingSpots();
			assertEquals(1, result);
			result = spot.avaiableParkingSpots();
			assertEquals(25, result);
			spot.raiseFullSpots();
			spot.raiseFullSpots();
			result = spot.avaiableParkingSpots();
			assertEquals(23, result);
			spot.lowerFullSpots();
			result = spot.avaiableParkingSpots();
			assertEquals(24, result);
		}

}
