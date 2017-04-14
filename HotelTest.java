public class HotelTest {

   public static void main(String[] args) {

       Hotel hotel = new Hotel("Beach Marriot", "Chicago");
       hotel.addRoom(101, "queen", 's', 100);
       hotel.addRoom(102, "king", 'n', 110);
       hotel.addRoom(103, "king", 's', 88);
       hotel.addRoom(104, "twin", 's', 100);
       hotel.addRoom(105, "queen", 'n', 99);
      
       hotel.addReservation("Coffey", 'n',"king","2014-12-10","2014-12-15");
       hotel.addReservation("Coffey", 'n',"king","2014-12-16","2014-12-18");
      
       System.out.println("-----------------------------");
       System.out.println(hotel);
       System.out.println("-----------------------------");

   }

}