import static org.junit.jupiter.api.Assertions.*;

import java.time.*;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class FirstTests {

	//test for the calss Parking Ticket 

		//test for the class ParkingSpot
		@Test 
		void test_ParkingSpot() {
			ParkingSpot spot = new ParkingSpot(25,1);
			int result = spot.categorieParkingSpots();
			assertEquals(1, result);
			result = spot.avaiableParkingSpots();
			assertEquals(25, result);
			int z = spot.raiseFullSpots();
			z = spot.raiseFullSpots();
			result = spot.avaiableParkingSpots();
			assertEquals(23, result);
			z =spot.lowerFullSpots();
			result = spot.avaiableParkingSpots();
			assertEquals(24, result);
		}
		//test for the  getter from the Employee class
		@Test 
		void test_Employee_getter() {
			Employee emp = new Employee("Hans Peter",9.35,LocalDateTime.of(2020, 01, 01, 00, 01),8);
			String s = emp.getName();
			assertEquals("Hans Peter", s);
			LocalDateTime shiftStart = emp.getShiftStart();
			assertEquals(LocalDateTime.of(2020, 01, 01, 00, 01), shiftStart);
			int result = emp.getShift();
			assertEquals(8, result);
			LocalDateTime shiftEnd = emp.getShiftEnd();
			assertEquals(LocalDateTime.of(2020, 01, 01, 8, 01), shiftEnd);
			double dresult = emp.getMinimumWage();
			assertEquals(9.35, dresult);
			dresult = emp.getSalery();
			assertEquals(9.35*8, dresult);
			
		}
		//test for the  setter from the Employee class
		@Test 
		void test_Employee_setter() {
			Employee emp = new Employee("Hans Peter",9.35,LocalDateTime.of(2020, 01, 01, 00, 01),8);
			emp.setName("Dieter Mueller");
			String s = emp.getName();
			assertEquals("Dieter Mueller", s);
			
			emp.setShiftStart(LocalDateTime.of(2020, 01, 01, 00, 05));
			emp.setShift(12);
			LocalDateTime shiftStart = emp.getShiftStart();
			assertEquals(LocalDateTime.of(2020, 01, 01, 00, 05), shiftStart);
			int result = emp.getShift();
			assertEquals(12, result);
			LocalDateTime shiftEnd = emp.getShiftEnd();
			assertEquals(LocalDateTime.of(2020, 01, 01, 12, 05), shiftEnd);
			
			emp.setMinimumWage(8.35);
			double dresult = emp.getMinimumWage();
			assertEquals(8.35, dresult);
			dresult = emp.getSalery();
			assertEquals(8.35*12, dresult);
			
		}
}
