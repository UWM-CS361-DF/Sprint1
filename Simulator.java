import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Simulator {
	static ChronoInterface chronoTimer = new ChronoInterface();
	public static void parse(String lineInput) throws Exception{
		
		String[] input;
		
		input=lineInput.split(" ");
        
		if(input.length==1){
			Method method = chronoTimer.getClass().getMethod(input[0].toLowerCase());
			method.invoke(chronoTimer);
		}
		else if(input.length==2){
			Method method = chronoTimer.getClass().getMethod(input[0].toLowerCase(), String.class);
			method.invoke(chronoTimer, input[1]);
		}
		else if(input.length==3){
			Method method = chronoTimer.getClass().getMethod(input[0].toLowerCase(), String.class, String.class);
			method.invoke(chronoTimer, input[1], input[2]);
		}
			
			
			//POWER
//		if(input[0].equals("POWER"))
//			
//		//EXIT
//		else if(input[0].equals("EXIT"))
//			new Exit();
//		//RESET
//		else if(input[0].equals("RESET"))
//			new Reset();
//		//TIME
//		else if(input[0].equals("TIME"))
//			new Time(input[1]);
//		//DNF
//		else if(input[0].equals("DNF"))
//			new DNF();
//		//CANCEL
//		else if(input[0].equals("CANCEL"))
//			new Cancel();
//		//TOG
//		else if(input[0].equals("TOG"))
//			new Tog(Integer.parseInt(input[1]));
//		//TRIG	
//		else if(input[0].equals("TRIG"))
//			new Trig(Integer.parseInt(input[1]));
//		//START
//		else if(input[0].equals("START"))
//			new Start();
//		//FINISH
//		else if(input[0].equals("FINISH"))
//			new Finish();
//		else
//			throw new Exception("Not a Valid Command Stimulus");
	}
	
	public static void main(String[] args) throws Exception{
		Scanner scIn;// = new Scanner(System.in);
		String stringInput;
		String stringTime;
		
		if (args.length > 0 ){
			scIn = new Scanner(new File(args[0]));
		}
		else{
			scIn = new Scanner(System.in);
		}
		
		while(scIn.hasNextLine()){
			stringInput=scIn.nextLine();
			
			if(args.length>0){
				stringTime=stringInput.substring(0, stringInput.indexOf("\t"));
				stringInput=stringInput.substring(stringInput.indexOf("\t")+1, stringInput.length());
				Thread.sleep(1000); //wait 1 second before next line is executed
			}
			System.out.println(stringInput);
			if(stringInput.equals("EXIT")){
				System.out.println("Exited Simulator");
				scIn.close();
				break;
			}
			parse(stringInput);
		}
	}
}