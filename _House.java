
public class _House {

	private int kitchen;
	private int livingroom;
	private int dinningroom;
	private int bathroom;
	private int bedroom;
	private double area;
	
	//SET AND GET AREA
	public double area() {
		return area;		
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	//SET AND GET KITCHEN
	public int getKitchen() {
		return kitchen;
	}
	public void setKitchen(int kitchen) {
		if(kitchen > 0) {		
			this.kitchen = kitchen;
		}else {
		System.out.println("The kitchen is integrate in to the dinningroom");
		}
	}
	//SET AND GET LIVINGROOM
	public int getLivingroom() {
		return livingroom;
	}
	public void setLivingroom(int livingroom) {
		if(livingroom > 0) {		
			this.livingroom = livingroom;
		}else {
		System.out.println("The livingroom is integrate in to the dinningroom");
		}
	}
	
	//SET AND GET DINNINGROOM
	public int dinningroom() {
		return dinningroom;		
	}
	public void setDinningroom(int dinningroom) {
		this.dinningroom = dinningroom;
	}
	
	//SET AND GET BATHROOM
	public int bathroom() {
		return bathroom;		
	}
	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}
	
	//SET AND GET BEDROOM
	public int bedroom() {
		return bedroom;		
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	
	
	public String toString() {
		return kitchen + " kitchen\n" + livingroom + " livingroom\n" + dinningroom + " dinningroom\n" + bedroom + " bedroom\n" + bathroom + " bathroom.\nTotal area: " + area + "m2";
		
	}
	
}
