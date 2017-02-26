public class ChronoInterface {
	//List<Channel> channels = new ArrayList<Channel>(9);//0 will be an empty channel location for ease of assigning
	Csystem system = new Csystem();
//	Exit exit = new Exit();
	Reset reset = new Reset();
	Power power = new Power();
	Race race = new Race();
	Time time = new Time();
	
	public ChronoInterface(){
		
	}
	public void power(){
		if(power.powerStatus==false)
			power.powerOn();
		else
			power.powerOff();
		System.out.println(power.powerStatus ? "Power On" : "Power Off");		
	}
	//public void exit(){
		
	//}
	public void reset(){
		reset.reset();
	}
	public void time(String time){
		String[] splitTime= time.split(":");
		system.setTime(Integer.parseInt(splitTime[0]), Integer.parseInt(splitTime[1]), Integer.parseInt(splitTime[2]));
	}
	public void dnf(){
		race.dnf();
	}
	public void cancel(){
		race.cancel();
	}
	public void tog(String channel){
		system.tog(Integer.parseInt(channel));
	}
	public void trig(String channel){
		system.channels.get(Integer.parseInt(channel)).trig();
	}
	public void start(){
		system.channels.get(0).start();
	}
	public void finish(){
		system.channels.get(0).finish();
	}
	public void conn(String sensor, String channel){
		system.conn(sensor, Integer.parseInt(channel));
	}
	public void disc(String channel){
		system.disc(Integer.parseInt(channel));
	}
	public void event(String type){
		race.setEvent(type);
	}
	public void newrun(){
		race.newRun();
	}
	public void endrun(){
		race.endRun();
	}
	public void print(String run){
		race.print("");
	}
	public void export(String run){
		race.export("");
	}
	public void num(String number){
		race.setNum(Integer.parseInt(number));
	}
	public void clr(String number){
		race.clear(Integer.parseInt(number));
	}
	public void swap(){
		race.swap();
	}
}
