package Oops;

public class UseLapp {
	public static void main(String[]args) {
			
		Charger c=new Charger("Sony","black",500,1000,true);
		 Laptop l=new Laptop("hp","white",20000,c);
		 System.out.println(l);
		 
		}
	     
	}

class Laptop {
		 String brand;
		 String color;
		int price;
		 Charger charger;
		public Laptop (String brand,String color,int price,Charger charger) {
			this.brand=brand;
			this.color=color;
			this.price=price;
			this.charger=charger;
		}
		public String toString () {
			return brand+" "+color+" "+price+" "+charger;
		}
		public Charger getCharger () {
			return charger;
		}
	}
					
		class Charger {
			 String brand;
			 String color;
			 int capacity;
			 int price;
			 boolean isMetal;
			
			public Charger(String brand,String color,int capacity,int price,boolean isMetal) {
				this.brand=brand;
				this.color=color;
				this.capacity=capacity;
				this.price=price;
				this.isMetal=isMetal;
			}
			public String toString() {
				return "\n"+brand+" "+color+" "+capacity+" "+price+" "+isMetal;
			}
			}
		
						
			
		
