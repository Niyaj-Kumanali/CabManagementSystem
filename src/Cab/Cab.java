package Cab;

public class Cab {
	private int cabID;
	private String driverName;
	private long drivePhoneNo;
	private String modelNumber;
	private String cabLicensePlate;
	private Location pickupLocation;
	private Location dropLocation;
	
	public Cab(int cabID, String driverName, long drivePhoneNo, String modelNumber, String cabLicensePlate, String fromLongitude, String fromLattitude, String fromDirection, String toLongitude, String toLattitude, String toDirection) {
		this.cabID = cabID;
		this.driverName = driverName;
		this.drivePhoneNo = drivePhoneNo;
		this.modelNumber = modelNumber;
		this.cabLicensePlate = cabLicensePlate;
		pickupLocation = new Location(fromLattitude, fromLattitude, fromDirection);
		dropLocation = new Location(toLattitude, toLattitude, toDirection);
	}
	
	public int getCabID() {
		return cabID;
	}
	public void setCabID(int cabID) {
		this.cabID = cabID;
	}
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public long getDrivePhoneNo() {
		return drivePhoneNo;
	}
	public void setDrivePhoneNo(long drivePhoneNo) {
		this.drivePhoneNo = drivePhoneNo;
	}
	
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	public String getCabLicensePlate() {
		return cabLicensePlate;
	}
	public void setCabLicensePlate(String cabLicensePlate) {
		this.cabLicensePlate = cabLicensePlate;
	}
	
	public Location getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(Location pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	
	public Location getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(Location dropLocation) {
		this.dropLocation = dropLocation;
	}

	public void cabDetails() {
		
	}
	

}
