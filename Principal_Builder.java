public class Principal_Builder {
 
 	private House_Builder House_Builder = null;
 
 	public Principal_Builder(House_Builder House_Builder) {
 		this.House_Builder = House_Builder;
 	}
 
 	public void construct_House() {
 		House_Builder.buildarea();
 		House_Builder.buildkitchen();
 		House_Builder.buildlivingroom();
 		House_Builder.builddinningroom();
 		House_Builder.buildbedroom();
 		House_Builder.buildbathroom();
 		
 	}
 
 	public _House get_House() {
 		return House_Builder.get_House();
 	}
 
 }