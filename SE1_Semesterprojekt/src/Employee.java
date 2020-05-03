//import java.util.*;
//import java.lang.Object;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Employee {
	private LocalDateTime ShiftStart = LocalDateTime.of(2020, 01, 01, 00, 01);
	private int Shift = 8;
	private double minimumWage = 9.35;
	
	public Employee(LocalDateTime start, int shift, double mW) {
		ShiftStart = start;
		Shift = shift;
		minimumWage = mW;
	}
	
/* ## get() ## */
	public LocalDateTime getShiftStart() {
		return ShiftStart;
	}
	
	public int getShift() {
		return Shift;
	}
	
	public LocalDateTime getShiftEnd() {
		return ShiftStart.plusHours(Shift);
	}
	
	public double getMinimumWage() {
		return minimumWage;
	}
	
	public double getSalery() {
		return (Shift*minimumWage);
	}
	
/* ## set() ## */
	public LocalDateTime setShiftStart(LocalDateTime s) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		ShiftStart = LocalDateTime.parse(s.format(formatter), formatter); //s.format(formatter);
		return ShiftStart;
	}
	
	public int setShift(int s) {
		Shift = s;
		return Shift;
	}
	
	public double setMinimumWage(double mW) {
		minimumWage = mW;
		return minimumWage;
	}
		
}
