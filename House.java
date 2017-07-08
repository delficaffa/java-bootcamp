
public class House {

	private int kitchen;
	private int livingroom;
	private int dinningroom;
	private int bathroom;
	private int bedroom;
	private double area;
	
	
	//set and get AREA
	public void setArea(double newArea) {
		area = newArea;
	}
	public double getArea() { return area;
	}
	//set and get KITCHEN
	public void setKitchen(int newKitchen, double newArea) {
		if(newKitchen > 0) {
			kitchen = newKitchen;
			area = newArea;
		}else {
			System.out.println("The kitchen is integrate in to the Dinningroom");
			area = newArea;
		}
	}
	public int getKitchen() { return kitchen;
	}
	//set and get LIVINGROOM
	public void setLivingroom(int newLivingroom, double newArea) {
		if(newLivingroom > 0) {
			livingroom = newLivingroom;
			area = newArea;
		}else {
			System.out.println("The livingroom is integrate in to the Dinningroom");
			area = newArea;
		}				
	}
	public int getLivingroom() { return livingroom;
	}
	//set and get DINNINGROOM
	public void setDinningroom(int newDinningroom, double newArea) {
		dinningroom = newDinningroom;
		area = newArea;
	}
	public int getDinningroom() { return dinningroom;
	}
	//set and get BATHROOM
	public void setBathroom(int newBathroom, double newArea) {
		bathroom = newBathroom;	
		area = newArea;
	}
	public int getBathroom() { return bathroom;
	}
	//set and get BEDROOM
	public void setBedroom(int newBedroom, double newArea) {
		bedroom = newBedroom;	
		area = newArea;
	}
	public int getBedroom() { return bedroom;
	}


	
	
}
