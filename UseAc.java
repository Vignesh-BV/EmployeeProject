package Oops;

public class UseAc {
	public	static void main(String[]args) {
			Compressor c=new Compressor();
				c.setBrand("sony");
				c.setModel("12DFT007");
				c.setPrice(1000);
				c.setisMetal(true);
				
	      Ac ac=new Ac();
	      ac.setBrand("hp");
	      ac.setColor("white");
	      ac.setPrice(20000);
	      ac.setCapacity("2T");
	      ac.setCompressor(c);
	      
	      System.out.println(ac.getColor()+" "+ac.getBrand()+" "+ac.getPrice()+" "+ac.getCapacity()+"\n"+ac.getCompressor().getBrand()+" "+ac.getCompressor().getModel()+" "+ac.getCompressor().getPrice()+" "+ac.getCompressor().getisMetal());
		
	}
	}

			

	class Ac {
		private String brand;
		private String color;
		private int price;
		private String capacity;
		private Compressor compressor;
		public void setBrand(String brand) {
			this.brand=brand; }
		public String getBrand() {
			return brand; }
		public void setColor(String color) {
			this.color=color; }
		public String getColor() {
			return color; }
		public void setPrice(int price) {
				this.price=price;}
			public int getPrice() {
				return price; }
			public void setCapacity(String capacity) {
				this.capacity=capacity;}
			public String getCapacity() {
				return capacity; }
				public void setCompressor(Compressor compressor) {
					this.compressor=compressor;  }
				public Compressor getCompressor() {
					return compressor; }
	}
					
		class Compressor {
			private String brand;
			private String model;
			private boolean isMetal;
			private int price;
			
			public void setBrand(String a) {
				brand=a; }
			public String getBrand() {
				return brand; }
			public void setModel(String model) {
				this.model=model; }
			public String getModel() {
				return model; }
			public void setisMetal(boolean isMetal) {
				this.isMetal=isMetal; }
			public boolean getisMetal() {
				return isMetal; }
			public void setPrice(int price) {
					this.price=price;}
				public int getPrice() {
					return price; }
				
		}

		


