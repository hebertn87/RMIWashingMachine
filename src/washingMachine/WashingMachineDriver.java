package washingMachine;

public class WashingMachineDriver {
	public static void main(String args[]) {
		WashingMachine washingmachine = new WashingMachine();
		
		washingmachine.insertQuarter();
		washingmachine.insertQuarter();
		washingmachine.cancelWash();
		washingmachine.startLoad();
		washingmachine.insertQuarter();
		washingmachine.startLoad();
		washingmachine.startLoad();
		washingmachine.startLoad();
		
	}
}
