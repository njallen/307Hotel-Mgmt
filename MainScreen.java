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
		
		while(flag){
			
			System.out.println("Enter user type E)mployee, M)anager, or Q)uit:");
			String selector = input.nextLine();
			
			if(selector.equalsIgnoreCase("E")){
				Employee.launch();
			}
			else if(selector.equalsIgnoreCase("M")){
				Manager.launch();
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
