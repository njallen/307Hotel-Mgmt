import java.util.Scanner;

/**
 * 
 */

/**
 * @author Darrick
 *
 */
public class MainScreen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		
		  Hotel hotel = new Hotel("Sunrise B&B", "Ames");
	       hotel.addRoom(101, "queen", 'y', 175);
	       hotel.addRoom(102, "king", 'n', 200);
	       hotel.addRoom(103, "king", 'n', 200);
	       hotel.addRoom(104, "twin", 'n', 100);
	       hotel.addRoom(105, "queen", 'n', 175);
	       hotel.addRoom(106, "queen", 'y', 175);
	       hotel.addRoom(107, "double twin", 'n', 175);
	       hotel.addRoom(108, "king", 'y', 200);
	       hotel.addRoom(109, "double twin", 'y', 175);
	       hotel.addRoom(201, "queen", 'n', 175);
	       
	       
	       
		while(flag){
			
			System.out.println("Enter user type E)mployee, M)anager, or Q)uit:");
			String selector = input.nextLine();
			
			if(selector.equalsIgnoreCase("E")){
				
				
				System.out.println("Enter function type A)dd reservation, R)emove reservation, V)iew all rooms & status or Q)uit:");
				String add = input.nextLine();
				if(add.equalsIgnoreCase("A")){
					System.out.println("Enter customer name:");
					String customer = input.nextLine();
					System.out.println("Smoking(Y/N):");
					char smoking = input.nextLine().charAt(0);
					System.out.println("room type? (king, queen, double twin, twin)");
					String roomType = input.nextLine();
					System.out.println("Reservation start date(YYYY-MM-DD):");
					String startDate = input.nextLine();
					System.out.println("Reservation end");
					String endDate = input.nextLine();
					
					hotel.addReservation(customer, smoking, roomType, startDate, endDate);	
				}
				else if(add.equalsIgnoreCase("R")){
				System.out.println("Whos name is this reservation under?");	
				String cancelName = input.nextLine();
				hotel.cancelReservation(cancelName);
				}
				
				else if (add.equalsIgnoreCase("V")){
				hotel.printReservationList();
				}
				
				
				else if (selector.equalsIgnoreCase("Q")){
					System.out.println("Exiting System");
					flag = false;
				
			}}
			if(selector.equalsIgnoreCase("M")){
				Manager.launch();
				
				System.out.println("Enter function type: O)ccupancy Percentage, D)aily Sales");
				String function = input.nextLine();
				if(function.equalsIgnoreCase("O")){
					double occupancy = hotel.occupancyPercentage();
					System.out.println(occupancy);
				}
				else if(function.equalsIgnoreCase("D")){
					hotel.getDailySales();
				}
				else{
					System.out.println("Input error!");
				}
			}
			
			
			
			else if(selector.equalsIgnoreCase("Q")){
				System.out.println("Exiting System");
				flag = false;
			}
			else{
				System.out.println("Command not recgonized please re-enter");
			}
		}

	}

	}
