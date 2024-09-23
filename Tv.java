package Oops;

public class Tv {
	public static void main(String[]args) {
		Remote remote=new Remote("Sony",true,5000);
		Television tv=new Television("Sony","LED",true,50000,remote);
		System.out.println("Television: "+tv.getBrand()+" "+tv.getModel()+" "+tv.getIsLed()+" "+tv.getPrice()+"\n"+"Remote : "+tv.getRemote().getBrand()+" "+tv.getRemote().getIsDualBattery()+" "+tv.getRemote().getPrice());
		
	}

}


class 	Television {
	private String brand;
	private String model;
	private boolean isLed;
	private int price;
	private Remote remote;

 public Television(String brand,String model,boolean isLed,int price,Remote remote) {
	 this.brand=brand;
	 this.model=model;
	 this.isLed=isLed;
	 this.price=price;
	 this.remote=remote;
}
 public String getBrand() {
	 return brand;
 }
 public String getModel() {
	 return model;
 }
 public boolean getIsLed() {
	 return isLed;
 }
 public int getPrice() {
	 return price;
 }
 public Remote getRemote() {
	 return remote;
 }

}


class Remote {
	String brand;
	boolean isDualBattery;
	int price;
	public Remote(String brand,boolean isDualBattery,int price) {
		this.brand=brand;
		this.isDualBattery=isDualBattery;
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public boolean getIsDualBattery() {
		return isDualBattery;
	}
	public int getPrice() {
		return price;
	}
	
}

    
