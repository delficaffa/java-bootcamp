
public class hospitalFactory {
	
	public hospital getHospital(String quirophan) {
		if("yes".equals(quirophan)) {
			return new highcomplexity();
		} else {
			return new lowcomplexity();
		}
	}
	
	
}
