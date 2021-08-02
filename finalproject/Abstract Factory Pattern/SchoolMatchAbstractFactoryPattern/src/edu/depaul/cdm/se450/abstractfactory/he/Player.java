package edu.depaul.cdm.se450.abstractfactory.he;

public class Player {
	public static SchoolMatch pickMatch(String choice){
		   
	      if(choice.equalsIgnoreCase("Running")){
	         return (SchoolMatch) new RunningMatch();
	         
	      }else if(choice.equalsIgnoreCase("Jumping")){
	         return (SchoolMatch) new JumpingMatch();
	      }
	      
	      return null;
	   }
}
