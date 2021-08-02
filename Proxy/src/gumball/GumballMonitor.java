package gumball;

import java.rmi.*;
 
public class GumballMonitor {
	GumballMachineRemote machine;

	//will rely on remote interface instead of concrete GumballMachine class
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}

	//prints a report with location inventory and the machine's state
	public void report() {
		try {
			System.out.println("Gumball Machine: " + machine.getLocation());
			System.out.println("Current inventory: " + machine.getCount() + " gumballs");
			System.out.println("Current state: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
