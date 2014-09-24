
public class RoomStipulations
	{
	private int lengthOfStayRS;
	private int howManyRoomsRS;
	private String bedroomTypeRS;
	
	public RoomStipulations(int lRS, int hRS, String bRS)
		{
		lengthOfStayRS = lRS;
		howManyRoomsRS = hRS;
		bedroomTypeRS = bRS;
		}

	public int getLengthOfStayRS()
		{
		return lengthOfStayRS;
		}

	public void setLengthOfStayRS(int lengthOfStayRS)
		{
		this.lengthOfStayRS = lengthOfStayRS;
		}

	public int getHowManyRoomsRS()
		{
		return howManyRoomsRS;
		}

	public void setHowManyRoomsRS(int howManyRoomsRS)
		{
		this.howManyRoomsRS = howManyRoomsRS;
		}

	public String getBedroomTypeRS()
		{
		return bedroomTypeRS;
		}

	public void setBedroomTypeRS(String bedroomTypeRS)
		{
		this.bedroomTypeRS = bedroomTypeRS;
		}
	
	}
