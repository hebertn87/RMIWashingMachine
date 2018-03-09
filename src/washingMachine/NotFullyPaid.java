//Nathan Hebert 3/7/2018
package washingMachine;

public class NotFullyPaid implements State {

	WashingMachine washingMachine;
	int quarter = 0;
	int quartersNeeded = 4;
	
	public NotFullyPaid(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}
	
	public void insertQuarter() {
		
		quartersNeeded--;
		quarter++;
		System.out.println("You have inserted " + quarter + " quarter(s). You need" + quartersNeeded + " quarters to start");
		
		if(quartersNeeded == 0) {
			washingMachine.setState(washingMachine.getPaid());
		}
	}

	public void ejectQuarter() {
		
		if(quarter == 0) {
		System.out.println("You haven't inserted a quarter");
		}
		else if(quarter > 0){
			quarter = 0;
			System.out.println("You have ejected all quarters");
		}
	}


	public void startLoad() {
		System.out.println("You can't start if you haven't inserted a quarter");	
	}

	public void cancel() {
		System.out.println("You can't cancel if it's not started yet");	
	}

	@Override
	public void exception() {
				
	}

}
