package inheritence;

public class vehicle {
	private String make;
	private String vehicleNumber;
	private String fuelType;
	private Integer fuelCapacity;
	private Integer cc;
	public vehicle(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	} 
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void displayMake() {
		System.out.print("***"+getMake()+"***");
	}
	public void displayBasicInfo() {
		System.out.println("----Basic Informatin---");
		System.out.println("Vehicle Number:"+getVehicleNumber());
		System.out.println("Fuel Capacity:"+getFuelCapacity());
		System.out.println("Fuel Type:"+getFuelType());
		System.out.println("CC:"+getCc());
	}
	public void displayDetailInfo() {
		
	}
	
}
