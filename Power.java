
public class Power {
	private boolean powerStatus;
	
	public Power(){
		powerStatus = false; //default value
		if (!powerStatus) powerStatus = true;
		if (powerStatus) powerStatus = false;
	}
}