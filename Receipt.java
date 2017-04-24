//import the decimal format to format the decimal numbers
import java.io.FileNotFoundException;

//util package to use the Scanner class

import java.text.DecimalFormat;

import java.util.*;

//Store class

public class Receipt

{

     //main method

     public static void main(String args[]) throws FileNotFoundException

     {
    	 
          //Scanner object

          Scanner in=new Scanner(System.in);

          //define a string Decimal pattern

          String pattern = "0000.00";

          //create a DecimalFormat object

          DecimalFormat decimalFormat = new DecimalFormat(pattern);

          //declare the string array of items

          String items[]=new String[]{"twin", "double twin", "queen", "king"};

          //define and declare the itemquantity array

          //and unitCost array

          int itemquantity[]=new int[items.length];

          double unitCost[]=new double[]{100,175,175,200};

          //Prompt the user to enter the quantities

          System.out.println("Enter number of nights stayed under the customers room type:");

          //loop to get the quantity of each it
          
          
          
          
          
          for(int i=0;i<items.length;i++)

          {

              System.out.println("Room type "+items[i]+": ");

              itemquantity[i]=in.nextInt();

          }

          //compute the cost of each item

          double cost[]=new double[unitCost.length];

          for(int i=0;i<unitCost.length;i++)

          {

              cost[i]=unitCost[i]*itemquantity[i];

          }

          //declare the required variables

          double total=0;

          double HST=0;

          double grandTotal=0;

          //print the header of the format

          String head[]={"Item","Qty","Unit Price","Total Price"};

          //print the detailed format

          String space=" ";

          System.out.printf("%s %20s %15s %30s ", head[0], head[1], head[2], head[3]);

          System.out.println("\n==========================================================================");

          for(int i=0;i<items.length;i++)

          {        

              System.out.printf("%-13s %10d %15.2f %20s $%s\n",items[i], itemquantity[i], unitCost[i],space, decimalFormat.format(cost[i]));

              total+=cost[i];

          }

          System.out.println("\n==========================================================================");

          //compute the sales tax

          HST=total*13/100;

          //Compute the grandTotal

          grandTotal=total+HST;

          //print the final result

          String subInfo[]={"Sub Total", "13% Sales Tax", "Grand Total"};

          System.out.printf("%45s %15s $%s\n", subInfo[0],space, decimalFormat.format(total) );

          System.out.printf("%45s %15s $%s\n", subInfo[1],space, decimalFormat.format(HST));

          System.out.printf("%45s %15s $%s\n", subInfo[2],space, decimalFormat.format(grandTotal));
          }
     }

