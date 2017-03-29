public class Room {
	public static void main(String[] args) {}
   private int roomNum;
   private String bedType;
   private double rate;
   private String occupantName;
   private char smoking;
   private boolean occupied;
  
   //default constructor
   public Room() {

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
  
   @Override
   public String toString() {
       String status=(isOccupied()==true)?getOccupantName():"Not Occupied";
       return "Room Number: " +getRoomNum()+"\n"+
               "Occupant name:"+status+"\n"+
               "Smoking room: " +getSmoking()+"\n"+
               "Bed Type: queen " +getBedType()+"\n"+
               "Rate: "+getRate()+"\n";
   }
}

	