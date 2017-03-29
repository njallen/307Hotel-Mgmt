

public class Hotel {
public static void main(String[] args) {}
   private static final int NOT_FOUND = -1;
   private Room[] rooms;
   private String name;
   private String location;
   private int occupiedCnt;
   private int numOfRooms;
  
   public Hotel() {
       rooms = new Room[10];
   }

   public Hotel(String name, String location) {
       super();
       this.name = name;
       this.location = location;
       numOfRooms=0;
       occupiedCnt=0;
       rooms = new Room[10];
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getLocation() {
       return location;
   }

   public void setLocation(String location) {
       this.location = location;
   }
  
   public boolean isFull() {
       if(occupiedCnt==numOfRooms) {
           return true;
       } else {
           return false;
       }
   }
  
   public boolean isEmpty() {
       if(occupiedCnt==0) {
           return true;
       } else {
           return false;
       }
   }

   public void addRoom(int roomNum,String bedType,char smoking,double rate) {
      
       Room room = new Room(roomNum, bedType, smoking, rate);
       room.setOccupied(false);
       rooms[numOfRooms] = room;
       numOfRooms++;
   }
  
   public void addReservation(String occupantName,char smoking,String bedType) {
      
       boolean reservationStatus=false;
       for(int i=0;i<numOfRooms;i++) {
           Room room = rooms[i];
           if(room!=null
                   && !room.isOccupied()
                   && room.getBedType().equalsIgnoreCase(bedType)
                   && room.getSmoking()==smoking) {
              
               System.out.println("Room found with criteria");
               room.setOccupied(true);
               room.setOccupantName(occupantName);
               occupiedCnt++;
               reservationStatus=true;
               System.out.println(room);
               System.out.println("Room Reserved successfully\n");
               break;
           }
       }
       if(reservationStatus==false) {
           System.out.println("Rooms not Available!");
       }
   }
  
   public void cancelReservation(String visitorName) {

       boolean cancellationStatus=false;
       for(int i=0;i<numOfRooms;i++) {
           Room room = rooms[i];
           if(room!=null
                   && room.isOccupied()
                   && room.getOccupantName().equalsIgnoreCase(visitorName)) {
              
               System.out.println("Room found with criteria");
               System.out.println(room);
               room.setOccupied(false);
               occupiedCnt--;
               cancellationStatus=true;
               System.out.println("Canecllation successfully");
               break;
           }
       }
       if(cancellationStatus==false) {
           System.out.println("Cancellation denied, No record found!");
       }
      
   }
  
   public int findReservation(String visitorName) {

       int result=-1;
       boolean found=false;
       for(int i=0;i<numOfRooms;i++) {
           Room room = rooms[i];
           if(room!=null
                   && room.isOccupied()
                   && room.getOccupantName().equalsIgnoreCase(visitorName)) {
               result = room.getRoomNum();
               found=true;
               break;
           }
       }
       if(found==false) {
           return NOT_FOUND;
       } else {
           return result;
       }

   }
  
   public void printReservationList() {

       for(int i=0;i<numOfRooms;i++) {
           Room room = rooms[i];
           if(room!=null
                   && room.isOccupied()) {
               System.out.println(room);
           }
       }

   }

   public double getDailySales() {

       double totalSales=0;
       for(int i=0;i<numOfRooms;i++) {
           Room room = rooms[i];
           if(room!=null
                   && room.isOccupied()) {
               totalSales = totalSales + room.getRate();
           }
       }
       return totalSales;
   }
  
   public double occupancyPercentage(){
       return ((double)occupiedCnt/numOfRooms)*100;
   }
  
   @Override
   public String toString() {
      
       String roomDetails="";
       for(int i=0;i<numOfRooms;i++) {
           Room room = rooms[i];  
           if(room!=null) {
               roomDetails = roomDetails+ room.toString()+"\n";
           }
       }
       return "Hotel Name : "+getName()+"\n"+
               "Number of Rooms : "+numOfRooms+"\n"+
               "Number of Occupied Rooms : "+occupiedCnt+"\n\n"+
               "Room Details are:\n\n"+roomDetails;
   }
   

}