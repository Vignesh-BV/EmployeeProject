package Oops;

public class UseCar {
	public static void main(String[]args) {
	Engine1 e=new Engine1();
		e.brand="Ferari";
		e.price=200000;
		e.cc=5000;
		e.isPetrol=true;
		
     Car1 c=new Car1();
     c.brand="Ford";
     c.price=400000;
     c.color="Black";
     c.engine1=e;
	
	System.out.println("Car - "+c.brand+" "+c.price+" "+c.color+"\n"+"\n"+"Car Engine - "+c.engine1.brand+" "+c.engine1.price+" "+c.engine1.cc+" "+c.engine1.isPetrol);
	
	}
	
}


class Car1 { //Composition //Main Class
String brand;	
int price;
String color;
Engine1 engine1;
}

class Engine1 { //Custom Class
	String brand;	
	int price;
	int cc;
	boolean isPetrol;
}



