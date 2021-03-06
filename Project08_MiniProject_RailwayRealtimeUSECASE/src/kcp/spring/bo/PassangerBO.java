package kcp.spring.bo;

public class PassangerBO {
    	private String PassangerName;
    	private int Age;
    	private String Address;
    	private  String sourcePoint;
    	private  String destinationPoint;
    	private double jouranyAmount;
    	private double discoutAmount;
    	private int totalDistance;
    	
	public int getTotalDistance() {
	    return totalDistance;
	}
	public void setTotalDistance(int totalDistance) {
	    this.totalDistance = totalDistance;
	}
	public String getPassangerName() {
	    return PassangerName;
	}
	public void setPassangerName(String passangerName) {
	    PassangerName = passangerName;
	}
	public int getAge() {
	    return Age;
	}
	public void setAge(int age) {
	    Age = age;
	}
	public String getAddress() {
	    return Address;
	}
	public void setAddress(String address) {
	    Address = address;
	}
	public String getSourcePoint() {
	    return sourcePoint;
	}
	public void setSourcePoint(String sourcePoint) {
	    this.sourcePoint = sourcePoint;
	}
	public String getDestinationPoint() {
	    return destinationPoint;
	}
	public void setDestinationPoint(String destinationPoint) {
	    this.destinationPoint = destinationPoint;
	}
	public double getJouranyAmount() {
	    return jouranyAmount;
	}
	public void setJouranyAmount(double jouranyAmount) {
	    this.jouranyAmount = jouranyAmount;
	}
	public double getDiscoutAmount() {
	    return discoutAmount;
	}
	public void setDiscoutAmount(double discoutAmount) {
	    this.discoutAmount = discoutAmount;
	}
}
