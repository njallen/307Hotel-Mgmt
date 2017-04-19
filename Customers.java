import java.util.Scanner;

public class Customers {
   private String[] customerNames;   //declare array of customer names
   Customers(){
       customerNames=new String[5];   //allocate spaces for 5 customer names
       customerNames[0]="def, abc";   //initialize customer name
       customerNames[1]="abc, def";   //initialize customer name
       customerNames[2]="uvw, xyz";   //initialize customer name
       customerNames[3]="xyz, uvw";   //initialize customer name
   }
   void addName(String name){
       customerNames[4]=name;   //add the customer name
       System.out.println("Customer Name "+name+" added successfully");   //display message that customer name is added
   }
   int noOfItems(){
       return customerNames.length;   //return total no of customer names
   }
   void sortCustomerNames(){   //sort customer names in alphabetical order
       String temp;   //variable to hold temporary data
       for(int i=0;i<customerNames.length-1;i++){   //bubble sort
           for(int j=0;j<customerNames.length-i-1;j++){
               if(customerNames[j].compareTo(customerNames[j+1])>0){   //compare names
                   temp=customerNames[j];   //swap names
                   customerNames[j]=customerNames[j+1];
                   customerNames[j+1]=temp;
               }
           }
       }
   }
   void printCustomerNames(){
       for(String c:customerNames){
           System.out.println(c);   //display customer names
       }
   }
   boolean findCustomerName(String key){
       for(String c:customerNames){
           if(c.equals(key)){   //if customer names if found return true
               return true;
           }          
       }
       return false;
   }
   public static void main(String[] args){
       Customers c=new Customers();   //create a new customers object
       System.out.println("Enter a new customer name in the format Last_name, First_name:");   //prompt user to enter a customer name
       Scanner s=new Scanner(System.in);   //declare a scanner variable to accept input from consoles
       String name=s.nextLine();   //accept the customer name entered
       c.addName(name);   //call method addName() to add the name entered
       System.out.println("Total number of customer names:"+c.noOfItems());   //display total no of customer names present
       c.sortCustomerNames();   //sort the customer names
       System.out.println("Customer names in alphabetically sorted order");
       c.printCustomerNames();   //display sorted customer names
       String key;   //string variable to hold customer name to be searched
       while(true){
           System.out.println("Enter a customer name to search for or type letter 'Q' to stop");   //ask user to enter name to be searched
           key=s.nextLine();   //accept the name
           if(key.equals("Q")){   //quit if user enters letter Q
               break;
           }
           if(c.findCustomerName(key)){   //find the customer name
               System.out.println("Customer name "+key+" is present in customer names array");
           }else{
               System.out.println("Customer name "+key+" is NOT present in customer names array");
           }
       }
   }
}
