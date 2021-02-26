package inheritence;

public class FourWheeler extends vehicle {
	private String audioSystem;
	private int numberofDoors;
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc,
			String audioSystem, int numberofDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberofDoors = numberofDoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberofDoors() {
		return numberofDoors;
	}
	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}
	public void displayInfo() {
		System.out.println("audioSystem:"+audioSystem);
		System.out.println("Number of Doors:"+numberofDoors);
	}
	

}
