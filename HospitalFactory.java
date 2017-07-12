
public class HospitalFactory {
	
	public Hospital getHospital(String type) {
		if("high".equals(type)) {
			return new Highcomplexity();
		} else {
			return new Lowcomplexity();
		}
	}
	
	
	
}
