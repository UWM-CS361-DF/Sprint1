import java.util.Calendar;

public class Csystem {
	
	
	public void setTime(int hr, int min, int sec){
		Calendar time = Calendar.getInstance();
		time.set(Calendar.HOUR_OF_DAY, hr);
		time.set(Calendar.MINUTE, min);
		time.set(Calendar.SECOND, sec);
	}
}
