import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Room {
	public static void main(String[] args) {}
   private int roomNum;
   private String bedType;
   private double rate;
   private String occupantName;
   private char smoking;
   private boolean occupied;
   private ArrayList<LocalDate> totalDates;
   //default constructor
   public Room() {
	   this.totalDates=new ArrayList<>();
   }

   //Parameterized constructor
   public Room(int roomNum, String bedType,char smoking, double rate) {
       this.roomNum = roomNum;
       this.bedType = bedType;
       this.rate = rate;
       this.smoking = smoking;
   }

   public int getRoomNum() {
       return roomNum;
   }

   public void setRoomNum(int roomNum) {
       this.roomNum = roomNum;
   }

   public String getBedType() {
       return bedType;
   }

   public void setBedType(String bedType) {
       this.bedType = bedType;
   }

   public double getRate() {
       return rate;
   }

   public void setRate(double rate) {
       this.rate = rate;
   }

   public String getOccupantName() {
       return occupantName;
   }

   public void setOccupantName(String occupantName) {
       this.occupantName = occupantName;
   }

   public char getSmoking() {
       return smoking;
   }

   public void setSmoking(char smoking) {
       this.smoking = smoking;
   }

   public boolean isOccupied() {
       return occupied;
   }

   public void setOccupied(boolean occupied) {
       this.occupied = occupied;
   }
   
   public String getTotalDate(){
	   if(totalDates != null){
	   return totalDates.toString();
	   }
	   else{
		   return "No days reserved";
	   }
   }
   /**
    * enter two dates and will reserve those two days and the days in between
    * @param start
    * @param end
    */
   public void setTotalDate(LocalDate start, LocalDate end){
	   //this.totalDates=new ArrayList<>();
	   if(totalDates == null){
		   this.totalDates=new ArrayList<>();
		   while (!start.isAfter(end)) {
			   totalDates.add(start);
			   start = start.plusDays(1);
		   }
	   }
	   else{
		   while (!start.isAfter(end)) {
			   totalDates.add(start);
			   start = start.plusDays(1);
		   }
		   
	   }
   }
   /**
    * takes two dates and checks against Rooms arraylist if they already exist
    * @param startDate
    * @param endDate
    * @return
    */
   public  boolean checkTotalDate(String startDate, String endDate){

	   LocalDate start2 = LocalDate.parse(startDate);
	   LocalDate end2 = LocalDate.parse(endDate);
	   int value ;
	   int value2 ;
	   boolean searchResult = true;
	   
	   if(totalDates != null){
	   
	   value = Collections.binarySearch(totalDates, start2);
	   value2 = Collections.binarySearch(totalDates, end2);
	  
	   if (value < 0 && value2 < 0) {
			setTotalDate(start2, end2);
		   searchResult = true;
	   }
	   }
	   else if( totalDates == null){
		   setTotalDate(start2,end2);
		   searchResult = true;
	   }
	   
	   else{
		   searchResult = false;
	   }
	   return searchResult;
   }

  
   @Override
   public String toString() {
       String status=(isOccupied()==true)?getOccupantName():"Not Occupied";
       return "Room Number: " +getRoomNum()+"\n"+
               "Occupant name:"+status+"\n"+
               "Smoking room: " +getSmoking()+"\n"+
               "Bed Type:  " +getBedType()+"\n"+
               "Daily Rate: "+getRate()+"\n"+
       		   "Days Reserved:"+ getTotalDate();
   }
}

	