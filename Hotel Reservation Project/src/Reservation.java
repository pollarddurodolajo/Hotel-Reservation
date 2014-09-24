public class Reservation
	{
	private String personsName;
	private int lengthOfStay;
	private int howManyRooms;
	private String bedroomType;
	
	public Reservation(String pN, int l, int hmr, String bT)
		{
		personsName = pN;

		lengthOfStay = l;
		howManyRooms = hmr;
		bedroomType = bT;
		}

	public String getPersonsName()
		{
		return personsName;
		}

	public void setPersonsName(String personsName)
		{
		this.personsName = personsName;
		}

	public int getLengthOfStay()
		{
		return lengthOfStay;
		}

	public void setLengthOfStay(int lengthOfStay)
		{
		this.lengthOfStay = lengthOfStay;
		}

	public String getBedroomType()
		{
		return bedroomType;
		}

	public void setBedroomType(String bedroomType)
		{
		this.bedroomType = bedroomType;
		}

	public int getHowManyRooms()
		{
		return howManyRooms;
		}

	public void setHowManyRooms(int howManyRooms)
		{
		this.howManyRooms = howManyRooms;
		}

	@Override
	public String toString()
		{
		return "Name: " + personsName + "\t lengthOfStay="
				+ lengthOfStay + ", howManyRooms=" + howManyRooms
				+ ", bedroomType=" + bedroomType + "]";
		}


	
	}

