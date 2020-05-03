//import java.lang.Object;
import java.time.*;
import java.util.Random;
import java.time.format.DateTimeFormatter;
public class Employee {
	private LocalDateTime ShiftStart = LocalDateTime.of(2020, 01, 01, 00, 01);
	private int Shift = 8;
	private double minimumWage = 9.35;
	public String name = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:ms"));
	
	public Employee(String n, double mW, LocalDateTime start, int shift) {
		name = n;
		minimumWage = mW;
		ShiftStart = start;
		Shift = shift;
	}
	
/* BEGIN ## get() ##*/
	public String getName() {
		return name;
	}
	
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
/* END ## get() ##*/
	
	
/* BEGIN ## set() ## */
	public String setName(String n) {
		return name = n;
	}
	
	public LocalDateTime setShiftStart(LocalDateTime s) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		return ShiftStart = LocalDateTime.parse(s.format(formatter), formatter); //s.format(formatter);
	}
	
	public int setShift(int s) {
		return Shift = s;
	}
	
	public double setMinimumWage(double mW) {
		return minimumWage = mW;
	}
/* END ## set() ## */
}
