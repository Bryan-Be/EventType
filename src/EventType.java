
import java.util.Scanner;


public class EventType {

	public static void main(String[] args) {		
	Scanner scnr = new Scanner(System.in);
	
			      String eventType;			     
			      int partySize;
			      String result;	
			      String typeFood;
			      
			      System.out.println("What type of Event?:  ");
			      System.out.println("(acceptable answers are casual, semi-formal, and formal)");
			      eventType = scnr.next();
			      
			
			     
			      if (eventType.equals("casual")) {
				         System.out.println("You'll be cooking sandwhiches.");				         
				      }typeFood = ("sandwhiches");

				  if (eventType.equals("semi-formal")) {
				         System.out.println("You'll be cooking fried chicken.");
				         typeFood = ("fried chicken");
				      }

				  if (eventType.equals("formal")) {
				         System.out.println("You'll be cooking chicken parmesan.");
				         typeFood = ("chicken parmesan");				        
				  		}
			
				  
				  System.out.println("How many people will be attending?:  ");					  
				  partySize = scnr.nextInt();				  
				  String whereCooking;
				  
				  
				  
				  if (partySize == 1) {
				         System.out.println("You'll be cooking in the microwave.");
				   }whereCooking = ("You'll be cooking in the microwave");

				  if ((partySize >= 2) && (partySize <= 12 )) {
				         System.out.println("You'll be cooking in your kitchen.");
				         whereCooking = ("You'll be cooking in your kitchen");
				   }
				  if (partySize >= 13) {
					         System.out.println("You'll be getting a caterer to provide food for the event.");
					         whereCooking = ("You'll be getting a caterer to provide food for the event");
				   }
				  result = ("To review you’ll be hosting a " +eventType+ " event for " +partySize+ " hungry friends,"
						  + " you should serve " +typeFood+ " and " +whereCooking+ ".");
			 System.out.println(result);	
			 
			      }
			      
	}
	
					 