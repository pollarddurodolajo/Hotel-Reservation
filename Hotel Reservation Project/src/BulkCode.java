import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BulkCode
	{
	static ArrayList<Reservation> reservationsOnRecord = new ArrayList<Reservation>();
	static ArrayList<Integer> allRooms = new ArrayList<Integer>();
	static int hotelRoomNumbers [][] = new int [2][5];
	static String hotel [][] = new String [2][5];
	static int roomNumbers [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	static int randomRow = (int) (Math.random()* 2) + 1;
	static int randomColumn = (int) (Math.random()* 5) + 1;
	static int randomRow2 = (int) (Math.random()* 2) + 1;
	static int randomColumn2 = (int) (Math.random()* 5) + 1;
	static int counter = 0;
	static int roomNumber;
	
	public static void setReservationsEmpty()
		{
		reservationsOnRecord.add(new Reservation("", 0, 0, ""));
		}
	
	public static void createRooms()
	{
		for(int rows = 0; rows < 2; rows++)
		{
			for(int columns = 0; columns < 5; columns++)
			{
				hotel[rows][columns] = "empty";
			}
		}
		
		for(int theRooms : roomNumbers)
		{
			allRooms.add(theRooms);
		}
		
		Collections.shuffle(allRooms);
		
		for (int rows2 = 0; rows2 < 2; rows2++)
		{
			for (int columns2 = 0; columns2 < 5; columns2++)
			{
				hotelRoomNumbers[rows2][columns2] = allRooms.get(counter);
				counter ++;
			}				
		}
	}
	
	public static void emptyOrFull()
	{
		if(hotel[randomRow][randomColumn].equals("empty"))	
		{
			roomNumber = hotelRoomNumbers[randomRow][randomColumn];
			hotel[randomRow][randomColumn].equals("full");
		}
		else if(hotel[randomRow][randomColumn].equals("full"))
		{
			roomNumber = hotelRoomNumbers[randomRow2][randomColumn2];
			hotel[randomRow2][randomColumn2].equals("full");
		}
	}
	
	public static void getReservation()
		{
				HotelResMain.tries++;
				System.out.println("Hello welcome to Hotel Shade. I will be taking your reservation today. What is your name?");
				Scanner userInput1 = new Scanner(System.in);
				String name1 = userInput1.nextLine();
				reservationsOnRecord.get(0).setPersonsName(name1);
		
				System.out.println("And how many days will you be staying with us?");
				Scanner userInput2 = new Scanner(System.in);
				int lengthOfStay1 = userInput2.nextInt();
				reservationsOnRecord.get(0).setLengthOfStay(lengthOfStay1);
		
				System.out.println("How many rooms would you prefer: 1 or 2");
				Scanner userInput3 = new Scanner(System.in);
				int numberOfRooms1 = userInput3.nextInt();
				reservationsOnRecord.get(0).setHowManyRooms(numberOfRooms1);
		
				System.out.println("What kind of room would you prefer? (2 Twin, 1 Queen, 1 King)");
				Scanner userInput4 = new Scanner(System.in);
				String bedroomType1 = userInput4.nextLine();
				reservationsOnRecord.get(0).setBedroomType(bedroomType1);

		}

	public static void generateRoomNumber()
		{
		System.out.println("Your room number is " + roomNumber);
		}

	@Override
	public String toString()
		{
		return "BulkCode [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
		}

	}
