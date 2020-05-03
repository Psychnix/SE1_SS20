import java.time.*;
import java.util.Random;

public class ParkingGarage {
/* ## BEGIN Variablen Deklaration ## */
	public Employee[] employers;
/* ## END Variablen Deklaration ## */
	

	
/* BEGIN ## Funktionen ## */
	public static int getRandNumInRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }
	
	public LocalDateTime hireEmployee() {
		return null;
	}
/* END ## Funktionen ## */

}
