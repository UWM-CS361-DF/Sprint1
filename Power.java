
public class Power {
	private boolean powerStatus;
	
	public Power(){
		powerStatus = false; //default value
	}
	
	public void powerOn(){
		if (!powerStatus) powerStatus = true;
		else System.out.println("Power is already On!");
	}
	
	public void powerOff(){
		if (powerStatus) powerStatus = false;
		else System.out.println("Power is already Off!");
	}
}
