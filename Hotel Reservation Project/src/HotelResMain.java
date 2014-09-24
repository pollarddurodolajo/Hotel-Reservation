import java.util.ArrayList;
import java.util.Scanner;

public class HotelResMain
	{
	static int numberOfReservations;
	static int tries = 0;
	
	public static void main(String[] args)
		{
		BulkCode.setReservationsEmpty();
		BulkCode.createRooms();
		
		Scanner numberOfReservations1 = new Scanner(System.in);
		System.out.println("In this program we will generate hotel reservations and make sure the rooms don't overlap. \nHow man reservations would you like to imput(1-10)");
		numberOfReservations = numberOfReservations1.nextInt();
		
		while (tries <= numberOfReservations)
		{
			BulkCode.getReservation();
			BulkCode.emptyOrFull();
			BulkCode.generateRoomNumber();

		}
		
		}

	}
