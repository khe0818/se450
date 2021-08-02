package gumball;

import java.rmi.*;
 
public class GumballMonitorTestDrive {

	public static void main(String[] args) {
	    //create an array of locations, one for each machine
		String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
		                     "rmi://boulder.mightygumball.com/gumballmachine",
		                     "rmi://seattle.mightygumball.com/gumballmachine"}; 
		
		if (args.length >= 0)
        {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/gumballmachine";
        }

        //create an array of monitors
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
		
		
		for (int i=0;i < location.length; i++) {
			try {
			    //returns a proxy to the remote Gumball Machine
           		GumballMachineRemote machine = 
						(GumballMachineRemote) Naming.lookup(location[i]); //get proxy for each remote machine
           		//create a new GumballMonitor and pass it the machine to monitor
                monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
        	} catch (Exception e) {
            	e.printStackTrace();
        	}
		}

		//iterate through each machine and print out its report
		for(int i=0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
