package inheritence;

public class twowheeler extends vehicle {
	private boolean KickStartAvailable;

	public twowheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		KickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return KickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		KickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo() {
		if(KickStartAvailable==true)
			System.out.println("KickStartAvailable:Yes");
		else
			System.out.println("KickStartAvailable:No");
	}
}
