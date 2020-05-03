import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTests {

	//test for the calss Parking Ticket
		@Test 
		void test_ParkingTicket() {
			ParkingTicket ticket = new ParkingTicket(1,0);
			int result = ticket.returnTicketCategorie();
			assertEquals(0, result);
			result = ticket.returnTicketNumber();
			assertEquals(1, result);
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
